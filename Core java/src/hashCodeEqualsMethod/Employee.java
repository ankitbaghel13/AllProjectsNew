package hashCodeEqualsMethod;

public class Employee {
	
	private String name;
	private String empID;
	
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {

		return "{name = "+name+", empID = "+empID+" }";
	}
	
	@Override
	public int hashCode() {

		return (name+empID).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Employee){
			Employee emp = (Employee) obj;
			return emp.getEmpID().equals(this.getEmpID()) && emp.getName().equals(this.getName());
		}
		else {
			return false;
		}
		
	}
}
