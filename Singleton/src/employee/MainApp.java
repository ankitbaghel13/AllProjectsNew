package employee;

import java.lang.reflect.Constructor;
/**
 * 
 * @author Ankit
 * The readResolve method is called when ObjectInputStream has read an object from the stream and is preparing to return it 
 * to the caller. ObjectInputStream checks whether the class of the object defines the readResolve method. If the method is 
 * defined, the readResolve method is called to allow the object in the stream to designate the object to be returned.
 * 
 */
public class MainApp {

	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {
		//Employee employee2  = new Employee();

		/*Employee employee = Employee.getInstance();
		Employee employee1 = Employee.getInstance();

		System.out.println("employee hash code : "+employee.hashCode());
		System.out.println("employee1 hash code : "+employee1.hashCode());

		System.out.println(employee.equals(employee1));*/

		/*Using reflection to break singleton*/

		Employee1 employee = Employee1.getInstance(); 

		Employee1 reflectedEmployee = null;

		Constructor[] constructors = Employee1.class.getDeclaredConstructors();

		for (Constructor constructor : constructors) {
			constructor.setAccessible(true);	
			try {
				reflectedEmployee = (Employee1)constructor.newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("employee hash code : "+employee.hashCode());
		System.out.println("employee1 hash code : "+reflectedEmployee.hashCode());

		System.out.println(employee.equals(reflectedEmployee));

	}
}
