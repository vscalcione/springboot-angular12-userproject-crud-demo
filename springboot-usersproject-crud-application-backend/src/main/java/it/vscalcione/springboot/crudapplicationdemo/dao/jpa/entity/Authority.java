package it.vscalcione.springboot.crudapplicationdemo.dao.jpa.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="AUTHORITIES")
@NamedQuery(name="Authority.findAll", query="SELECT a FROM Authority a")
public class Authority implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @Column(unique = true, nullable = false, length = 50)
    private String authority;

    @Column(nullable = false, length = 200)
    private String description;

    @ManyToMany(mappedBy = "authorities")
    private Set<Group> groups;

    @ManyToMany(mappedBy = "authorities")
    private Set<User> users;

    public Authority() {
    }

    public Authority(String authority, String description, Set<Group> groups, Set<User> users) {
        this.authority = authority;
        this.description = description;
        this.groups = groups;
        this.users = users;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Group> getGroups() {
        return groups;
    }

    public void setGroups(Set<Group> groups) {
        this.groups = groups;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Authority{" +
                "authority='" + authority + '\'' +
                ", description='" + description + '\'' +
                ", groups=" + groups +
                ", users=" + users +
                '}';
    }
}
