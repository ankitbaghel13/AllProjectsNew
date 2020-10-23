package lambdaExpressions;

interface FunctionalInterf{
	
	//public void m1();
	
	//public void add(int a,int b);
	
	public int getLength(String str);
}

class Demo implements FunctionalInterf{

	/*@Override
	public void m1() {
	
		System.out.println("Inside implemented method");
	}*/
	
	/*public void add(int a,int b){
		
		System.out.println("Sum by normal implementation is "+(a+b));
	}*/
	
	public int getLength(String str){
		
		return str.length();
	}
}

public class WithoutLambda {

	public static void main(String[] args) {
		
		FunctionalInterf interf = new Demo();
		//interf.m1();
		//interf.add(5, 10);
		System.out.println("Length by normal implementation is "+interf.getLength("Ankit"));
	}
	
}