package it.vscalcione.springboot.crudapplicationdemo.v1.dtos;

public class AuthorityDto {
	
	private String authority;
	private String description;
	
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
}
