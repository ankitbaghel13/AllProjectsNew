package customer;

import java.io.ObjectStreamException;
import java.io.Serializable;


//enum - thread safety,serialization,cloning,reflection
enum CustomerEnum{
	INSTANCE;
	
	public String getConfiguration(){
		return "sdbjs";
	}
}


//Why singleton
//for opening connections,
//for logging LogManager
public class Customer implements Serializable,Cloneable{

	private static final long serialVersionUID = 1L;

	//always check value from memory not cache
	//so it will see object as null not some half initialized object 
	private static volatile Customer customer;

	private Customer(){
		//To avoid reflection flaw
		if(customer != null)
			throw new RuntimeException("Cannot create, plz use getInstance()");

		//proceed with creation
		System.out.println("Inside constructor");
	}
	
	//Bill Pugh Singleton Implementation
	//Singleton inner holder class(ONLY for multi-threading)
	static class Holder{
		static final Customer INSTANCE = new Customer();
	}

	public static Customer getInstance(){
		//Double checked locking
		//Bug - half initialized object
		if(customer == null){//check1
			synchronized (Customer.class) {
				if(customer == null)//check2
					customer = new Customer();
			}
		}
		return customer;
		
		//return Holder.INSTANCE;
		
	}


	//Either throw CloneNotSupportedException or return same instance again
	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}


	// To avoid Serialization flaw
	// This method will be invoked when you will de-serialize the object
	private Object readResolve() throws ObjectStreamException{
		System.out.println("Inside read resolve");

		return customer;
	}
}
