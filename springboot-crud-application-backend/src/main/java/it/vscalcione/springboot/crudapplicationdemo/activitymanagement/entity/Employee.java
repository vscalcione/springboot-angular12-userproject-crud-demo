package it.vscalcione.springboot.crudapplicationdemo.activitymanagement.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "EMPLOYEE")
@NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_EMPLOYEE", unique = true, nullable = false)
    private Integer idEmployee;

    @Column(name = "FIRST_NAME", nullable = false, length = 100)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false, length = 100)
    private String lastName;

    @Column(name = "EMAIL", nullable = false, length = 100)
    private String email;

    @ManyToMany(mappedBy = "employees")
    private Set<Activity> activities;

    public Employee() {
    }

    public Employee(Integer idEmployee, String firstName, String lastName, String email, Set<Activity> activities) {
        this.idEmployee = idEmployee;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.activities = activities;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Activity> getActivities() {
        return activities;
    }

    public void setActivities(Set<Activity> activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", activities=" + activities +
                '}';
    }
}
