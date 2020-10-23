package accolite;

public class TesterClass {

	public void getEmployeeDetails(Employee e){
		System.out.println("Employee");
	}
	
	public void getEmployeeDetails(Manager m){
		System.out.println("Manager");
	}
	
	public static void main(String[] args) {
		
		Employee e2 = new Manager();
		TesterClass testerClass = new TesterClass();
		testerClass.getEmployeeDetails(e2);
	}
}
