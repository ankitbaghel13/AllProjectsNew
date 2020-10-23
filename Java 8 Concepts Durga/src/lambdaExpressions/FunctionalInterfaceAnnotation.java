package lambdaExpressions;

@FunctionalInterface
interface FunctionalInterf2{
	
	public void m1();
	//public void m2();
	public static void m3(){
		System.out.println("Inside functional interface static method");
	}
	
	public static void m6(){
		System.out.println("Inside functional interface static method");
	}
	
	default void m4(){
		System.out.println("Inside functional interface default method");
	}
	
	default void m5(){
		System.out.println("Inside functional interface default method");
	}
	
}

public class FunctionalInterfaceAnnotation {

	public static void main(String[] args) {

	}

}
