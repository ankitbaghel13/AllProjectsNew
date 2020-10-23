package MethodOverriding;

public class Manager extends Employee{
	
	public Manager(int salary){
		this.salary = salary;
	}

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public int salary =7;
	
	public int getSalary(){
		return 2;
	}
	
	public int getBonus(){
		return 3;
	}
	
	public static void main(String[] args) {
		
		Employee e = new Manager();
		System.out.println(e.getSalary());
		System.out.println(e.salary);
		
		Manager m = new Manager();
		System.out.println(m.salary);
		
		//System.out.println(e.getBonus());
		
		
	}
}
