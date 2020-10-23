package MethodOverriding;


//  1. We cannot override parent and static methods ... will get compile time while calling overridden method 
//	from hybrid reference
//	2. Visibilty of the overridden method cannot reduce from parent to child ... will get compile time error on the method
public class Child extends Parent{

	 public void a(){
		System.out.println("Inside Child");
	}
	
	public static void main(String[] args) {
		
		//Parent parent = new Parent();
		//Child child = new Child();
		Parent parent = new Child(); 
		
		parent.a();
	}
}
