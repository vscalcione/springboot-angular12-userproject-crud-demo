package it.vscalcione.springboot.crudapplicationdemo.v1.repositories;

import java.util.List;

import it.vscalcione.springboot.crudapplicationdemo.v1.dtos.AuthorityDto;
import it.vscalcione.springboot.crudapplicationdemo.v1.dtos.UserDto;

public interface UserRepository extends CrudRepository<UserDto, Integer> {
	void addAuthority(String username, String authority);
	void removeAuthority(String username, String authority);
	List<AuthorityDto> authoritiesList(String username);
}
