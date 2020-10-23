package org.maven.FirstHib;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee123")
public class Employee {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="empId")
	private String empId;
	
	@ManyToMany(cascade = CascadeType.ALL)
	/*@JoinTable(name="employee_useRole_mapping",
				joinColumns=@JoinColumn(name="employee_id"),
				inverseJoinColumns=@JoinColumn(name="userRole_id"))*/
	public List<UserRole> userRoles;

	public List<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRole> userRoles) {
		this.userRoles = userRoles;
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

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public int getId() {
		return id;
	}

	/*public void setId(int id) {
		this.id = id;
	}*/

}
