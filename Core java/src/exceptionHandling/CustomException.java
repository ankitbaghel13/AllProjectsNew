package exceptionHandling;


public class CustomException {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		try {
			myMethod();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println("Inside catch block : "+e.getMessage());
		}
	}

	public static void myMethod() throws MyException {
		
		String str = null;
		
		if(str == null){
			throw new MyException("ankit");
		}
		
	}
}

class MyException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3212002961704146636L;
	private String message;

	public MyException() {
		super();
	}
	
	public MyException(String message) {
		super(message);
		this.message = message;
	}
}