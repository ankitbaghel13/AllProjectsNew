package customer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustMain {

	public static void main(String[] args) throws Exception {
		
		//singleton();
		
		//Diff ways of breaking singleton :
		//reflection();
		serializable();
		//cloning();
		//mutliThreading();
		
	}

	
	private static void mutliThreading() {

		ExecutorService service  =Executors.newFixedThreadPool(2);
		
		service.submit(CustMain::useSingleton);
		service.submit(CustMain::useSingleton);
		
		service.shutdown();
	}


	private static void useSingleton() {
		
		//For ENUM
		//Customer customer = CustomerEnum.INSTANCE;

		Customer customer = Customer.getInstance();
		print("customer", customer);
	}


	//Breaking singleton using cloning
	@SuppressWarnings("unused")
	private static void cloning() throws Exception {

		Customer customer1 = Customer.getInstance();
		Customer customer2 = (Customer) customer1.clone();
		
		print("customer1",customer1);
		print("customer2",customer2);
	}



	//Breaking singleton using serialization
	@SuppressWarnings("unused")
	private static void serializable() throws Exception {

		Customer customer1 = Customer.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Singleton.txt"));
		
		oos.writeObject(customer1);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Singleton.txt"));
		Customer customer2 = (Customer) ois.readObject();
		
		print("customer1",customer1);
		print("customer2",customer2);
		
		ois.close();
		oos.close();
		
	}

	
	//checking singleton instance's hashcode
	public static void singleton() {
		Customer customer1 = Customer.getInstance();
		Customer customer2 = Customer.getInstance();
		
		print("customer1",customer1);
		print("customer2",customer2);
	}

	
	
	//Breaking singleton using reflection
	@SuppressWarnings("unused")
	private static void reflection() throws Exception {

		/*Class clazz = Class.forName("customer.Customer");
		clazz.getDeclaredConstructor();*/
		Customer customer1 = Customer.getInstance();
		print("customer1",customer1);
		
		Constructor<Customer> constructor =  Customer.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		
		Customer customer2 = constructor.newInstance();
		
		
		print("customer2",customer2);
		
	}

	private static void print(String name,Customer customer) {

		System.out.println(name+"'s hash code is : "+customer.hashCode());
	}
}
