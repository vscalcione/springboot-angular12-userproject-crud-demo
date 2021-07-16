package it.vscalcione.springboot.crudapplicationdemo.v2.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACTIVITY")
public class Activity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	private Date endDate;
	private Date startDate;
	private String activityName;
	
	private List<Employee> employees;
	
	public Activity() {
	}

	public Activity(Long id, Date endDate, Date startDate, String activityName, List<Employee> employees) {
		this.id = id;
		this.endDate = endDate;
		this.startDate = startDate;
		this.activityName = activityName;
		this.employees = employees;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setUsers(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Activity [id=" + id + ", endDate=" + endDate + ", startDate=" + startDate + ", activityName="
				+ activityName + ", employees=" + employees + "]";
	}
	
	
}
