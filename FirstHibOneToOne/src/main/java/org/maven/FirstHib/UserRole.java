package org.maven.FirstHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="userRole")
public class UserRole {

	@Id
	@Column(name="employee_id",unique=true,nullable=false)
	@GeneratedValue(generator="gen")
	@GenericGenerator(name="gen",strategy="foreign",parameters=@Parameter(name="property",value="employee"))
	private int id;
	
	//@Column(name="roleName")
	private String roleName;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	/*public void setId(int id) {
		this.id = id;
	}*/

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
