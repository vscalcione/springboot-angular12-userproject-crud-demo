package it.vscalcione.springboot.crudapplicationdemo.v1.dtos;

public class GroupDto {
	
	private String groupName;
	private String description;
	
	public String getGroupName() {
		return groupName;
	}
	
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
