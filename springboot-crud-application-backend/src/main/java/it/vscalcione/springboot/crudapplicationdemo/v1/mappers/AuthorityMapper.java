package it.vscalcione.springboot.crudapplicationdemo.v1.mappers;

import org.springframework.stereotype.Component;

import it.vscalcione.springboot.crudapplicationdemo.v1.dtos.AuthorityDto;

@Component
public class AuthorityMapper implements EntityDtoMapper<AuthorityDto, Authority> {

	@Override
	public void entityToDto(Authority e, AuthorityDto dto) {
		dto.setAuthority(e.getAuthority());
		dto.setDescription(e.getDescription());
	}

	@Override
	public void dtoToEntity(AuthorityDto dto, Authority e) {
		e.setAuthority(dto.getAuthority());
		e.setDescription(dto.getDescription());
		
	}

	@Override
	public AuthorityDto createDtoInstance() {
		return new AuthorityDto();
	}

	@Override
	public Authority createEntityInstance() {
		return new Authority();
	}
	
	

}
