package it.vscalcione.springboot.crudapplicationdemo.v2.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private String firstName;
	
	private String lastName;
	private String email;
	private String jobTitle;
	private String phone;
	private String imageUrl;
	private Date startJobDate;
	private String jobLocation;
	
	@ManyToMany(targetEntity = Activity.class, mappedBy = "activities", cascade = CascadeType.ALL)
	private List<Activity> activities;
	
	public Employee() {
	
	}

	public Employee(String firstName, String lastName, String email, String jobTitle, String phone, String imageUrl,
			Date startJobDate, String jobLocation, List<Activity> activities) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.jobTitle = jobTitle;
		this.phone = phone;
		this.imageUrl = imageUrl;
		this.startJobDate = startJobDate;
		this.jobLocation = jobLocation;
		this.activities = activities;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Date getStartJobDate() {
		return startJobDate;
	}

	public void setStartJobDate(Date startJobDate) {
		this.startJobDate = startJobDate;
	}

	public String getJobLocation() {
		return jobLocation;
	}

	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	public List<Activity> getActivities() {
		return activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", jobTitle="
				+ jobTitle + ", phone=" + phone + ", imageUrl=" + imageUrl + ", startJobDate=" + startJobDate
				+ ", jobLocation=" + jobLocation + ", activities=" + activities + "]";
	}
}
