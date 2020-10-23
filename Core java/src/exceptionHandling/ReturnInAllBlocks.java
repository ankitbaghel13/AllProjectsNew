package exceptionHandling;

public class ReturnInAllBlocks {

	public static void main(String[] args) {
		
		System.out.println(exception1());
	}

	private static int exception1() {

		try{
			System.out.println("Inside try");
			exception2();
			return 3;
		}
		catch(Exception e){
			System.out.println("Inside catch");
			//System.exit(1);
			return 2;
		}
		finally{
			System.out.println("Inside finally");
			return 1;
		}
	}

	private static void exception2() throws Exception {
		throw new Exception();
	}

}
