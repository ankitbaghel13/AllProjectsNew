package lambdaExpressions;

interface FunctionalInterf1{
	
	//public void m1();
	//public void add(int a,int b);
	public int getLength(String str);
}

public class WithLambda {

	public static void main(String[] args) {
		
		/*FunctionalInterf1 interf = () -> System.out.println("Inside implemented method");
		interf.m1();*/
		
		/*FunctionalInterf1 interf = (a,b) -> System.out.println("Sum by lambda implementation is "+(a+b));
		interf.add(5, 10);*/
		
		FunctionalInterf1 interf = s -> s.length();
		System.out.println("Length by lambda implementation is "+interf.getLength("Ankit"));
	}

}
