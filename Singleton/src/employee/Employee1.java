package employee;
/**
 * 
 * @author Ankit
 *
 */

/**
 * 
 * BILL PUGH Implementation
 *
 */
public class Employee1 {

	private Employee1(){
		System.out.println("Inside constructor");
	}


	private static class BillPugh{
		private static final Employee1 employee = new Employee1();
	}

	public static Employee1 getInstance(){
		System.out.println("Inside getInstance method");
		return BillPugh.employee;
	}

}
