package employee;

public class Employee {

	private Employee(){
		System.out.println("Inside constructor");
	}
	
	private static Employee employee;
	
	
	public static Employee getInstance(){
		
		if(employee == null){
			synchronized (employee) {
				if (employee==null) {
					employee = new Employee();
				}
			}
			
		}
		
		System.out.println("Returning instance of the class");
		return employee;
	}
	
}
