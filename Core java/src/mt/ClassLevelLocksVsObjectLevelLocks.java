package mt;

public class ClassLevelLocksVsObjectLevelLocks {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		Thread thread1 = new Thread(new Thread1(emp));
		Thread thread2 = new Thread(new Thread2(emp));
		
		thread1.start();
		thread2.start();
	}

}

class Employee{
	
	public void m1(){
		
	}
	
	public synchronized void m2(){
		
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
	
	public synchronized void m3(){
		
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
}
class Thread1 implements Runnable{
	
	Employee emp;
	public Thread1(Employee emp){
		this.emp = emp;
	}

	@Override
	public void run() {
		Thread.currentThread().setName("First");
		//Diff locks
		Employee e1 = new Employee();
		e1.m3();
		
		//Same lock
		//emp.m2();
		
		//Employee.m3();
	}
	
}
class Thread2 implements Runnable{
	
	Employee emp;
	public Thread2(Employee emp){
		this.emp = emp;
	}

	@Override
	public void run() {
		Thread.currentThread().setName("Second");
		//Diff locks
		Employee e1 = new Employee();
		e1.m3();
		
		//Same lock
		//emp.m3();
	}
	
}