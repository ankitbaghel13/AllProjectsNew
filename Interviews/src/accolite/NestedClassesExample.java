package accolite;

public class NestedClassesExample {
	
	private int a=1;
	public int b=2;
	public static int c=3;
	
	//Inner class(non-static nested class)
	public class InnerClass{
		
		public void printVariables(){
			System.out.println(a+" "+b+" "+c);
		}
	}
	
	//Static nested class
	public static class NestedStaticClass{
		public void printVariables(){
			//We can only use static variables in static class
			//System.out.println(a+" "+b);
			/*NestedClassesExample example = new NestedClassesExample();
			System.out.println(example.a+" "+example.b);*/
			System.out.println(c);
		}
	}
	

	public static void main(String[] args) {

		NestedClassesExample.NestedStaticClass nestedStaticClass= new NestedStaticClass();
		nestedStaticClass.printVariables();
		
		NestedClassesExample nestedClassesExample = new NestedClassesExample();
		NestedClassesExample.InnerClass innerClass = nestedClassesExample.new InnerClass();
		innerClass.printVariables();
	}

}
