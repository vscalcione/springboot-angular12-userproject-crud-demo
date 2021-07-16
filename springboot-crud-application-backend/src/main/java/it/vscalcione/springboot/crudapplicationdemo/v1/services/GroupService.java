package it.vscalcione.springboot.crudapplicationdemo.v1.services;

import java.util.List;

public interface GroupService extends CrudService<GroupDto, String> {
	void addAuthority(String groupName, String authority);
	void removeAuthority(String groupName, String authority);
	List<AuthorityDto> listAuthorities(String groupName);
	void addUser(String groupName, String username);
	void removeUser(String groupName, String username);
	List<UserDto> usersList(String groupName);
}
