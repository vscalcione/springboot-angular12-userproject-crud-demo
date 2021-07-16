package it.vscalcione.springboot.crudapplicationdemo.mappers;

import org.springframework.stereotype.Component;

import it.vscalcione.springboot.crudapplicationdemo.dtos.GroupDto;

@Component
public class GroupMapper implements EntityDtoMapper<GroupDto, Group> {

	@Override
	public void entityToDto(Group e, GroupDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dtoToEntity(GroupDto dto, Group e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GroupDto createDtoInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Group createEntityInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
