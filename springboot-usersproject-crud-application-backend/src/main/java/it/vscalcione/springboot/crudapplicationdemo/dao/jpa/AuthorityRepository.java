package it.vscalcione.springboot.crudapplicationdemo.dao.jpa;

import it.vscalcione.springboot.crudapplicationdemo.dao.jpa.entity.Authority;
import org.springframework.data.repository.CrudRepository;

public interface AuthorityRepository extends CrudRepository<Authority, String> {
    Iterable<Authority> findByGroups_GroupName(String groupName);
    Iterable<Authority> findByUsers_UserName(String userName);
}
