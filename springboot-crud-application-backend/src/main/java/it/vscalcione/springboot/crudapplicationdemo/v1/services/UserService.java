package it.vscalcione.springboot.crudapplicationdemo.v1.services;

import java.util.List;

public interface UserService extends CrudService<UserDto, Integer> {
	UserDto findByUsername(String username);
	void addAuthority(String username, String authority);
	void removeAuthority(String username, String authority);
	List<AuthorityDto> authoritiesList(String username);
}
