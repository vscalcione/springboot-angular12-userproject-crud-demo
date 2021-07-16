package it.vscalcione.springboot.crudapplicationdemo.v1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.vscalcione.springboot.crudapplicationdemo.v1.dtos.AuthorityDto;
import it.vscalcione.springboot.crudapplicationdemo.v1.dtos.GroupDto;
import it.vscalcione.springboot.crudapplicationdemo.v1.dtos.UserDto;

public interface GroupRepository extends CrudRepository<GroupDto, String>{
	
	void addAuthority(String groupName, String authority);
	void removeAuthority(String groupName, String authority);
	List<AuthorityDto> authoritiesList(String groupName);
	void addUser(String groupName, String username);
	void removeUser(String groupName, String username);
	List<UserDto> usersList(String groupName);

}
