package lambdaExpressions;

class RunnableClass implements Runnable{
	
	String name;
	
	public RunnableClass(String name){
		this.name = name;
	}

	@Override
	public void run() {

		for(int i=0;i<10;i++){
			
			System.out.println("Inside child thread "+name);
		}
	}
	
}

public class RunnableWithoutLambda {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new RunnableClass("Thread 1"));
		thread.start();
		
		for(int i=0;i<10;i++){
			System.out.println("Inside parent thread "+Thread.currentThread().getName());
		}

	}

}
