package MultiThreading;

public class ImplementThread implements Runnable{

	@Override
	public void run() {

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Runnable Thread : "+i);
				Thread.sleep(30);
			} 
		}catch (InterruptedException e) {
			System.out.println("Runnable Thread interrupted");
		}
		System.out.println("Runnable thread exiting");
	}


	public static void main(String[] args) {

		ImplementThread implementThread = new ImplementThread();
		Thread thread = new Thread(implementThread,"One");
		Thread thread1 = new Thread(implementThread,"Two");
		System.out.println("Thread : "+thread);
		thread.start();
		//System.out.println(thread.getName());
		thread1.start();

		System.out.println("Thread One is alive : "+thread.isAlive());
		System.out.println("Thread two is alive : "+thread1.isAlive());

		System.out.println("Waiting for threads to finish");

		try {
			thread.join();
			thread1.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("Thread One is alive : "+thread.isAlive());
		System.out.println("Thread two is alive : "+thread1.isAlive());

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Main thread : "+i);
				Thread.sleep(50);
			} 
		}catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thraed exiting");

	}

}
