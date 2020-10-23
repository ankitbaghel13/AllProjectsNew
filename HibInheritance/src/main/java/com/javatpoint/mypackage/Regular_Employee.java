package com.javatpoint.mypackage;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="regularemployee")
public class Regular_Employee extends Employee{

	@Column
	private float salary;  
	@Column
	private int bonus;
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}  
	
	
}
