package MethodOverriding;
class Parent1 {

	/*public Parent() {
		System.out.println("Parent default");
	}

	public Parent(int a){
		System.out.println("Parent parameterized");
	}*/
	
	public void add(){
		System.out.println("parent's method");
	}
	
	public void sum(int a,String b){
		System.out.println("parent's int string");
	}
	
	public static void subtract(){
		System.out.println("parent's method");
	}
	
}
class Child1 extends Parent1{
	
	/*public Child() {
		System.out.println("child default");
	}
	
	{
		System.out.println("Inside initialiation block");
	}
	
	public Child(int a){
		System.out.println("child parameterized");
	}
	*/
	public void sum(int a){
		System.out.println("inside child's int");
	}
	
	public void add(){
		System.out.println("child's method");
	}
	
	public static void subtract(){
		System.out.println("child's method");
	}
}


public class ParentChildMethodOverriding{
	public static void main(String[] args) {
		//Parent parent = new Child();
		Parent1 parent = new Parent1();
		Child1 child = new Child1();
		//parent.add();
		//parent.sum(1, "");
		child.sum(1);
		//parent.subtract();
		
	}
}
