package mt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolThreadDistribution {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		executor.execute(new Task1());
		executor.execute(new Task2());
		executor.execute(new Task3());
		
		executor.shutdown();
	}

}

class Task1 implements Runnable{

	@Override
	public void run() {
		
		String str = new String();
		
		for(int i=1;i<=100;i++){
			System.out.println(Thread.currentThread().getName()+" - Task1 "+i);
			try {
				synchronized(str){
				str.wait(1);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}

class Task2 implements Runnable{

	@Override
	public void run() {
		
		for(int i=1;i<=100;i++)
			System.out.println(Thread.currentThread().getName()+" - Task2 "+i);
	}
	
	
}

class Task3 implements Runnable{

	@Override
	public void run() {
		
		for(int i=1;i<=100;i++)
			System.out.println(Thread.currentThread().getName()+" - Task3 "+i);
	}
	
	
}
