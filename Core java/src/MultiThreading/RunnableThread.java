package MultiThreading;

public class RunnableThread implements Runnable{
	
	@Override
	public void run() {

		System.out.println("Thread : "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		Thread thread = new Thread(new RunnableThread(),"Thread-2");
		thread.start();
	}

}
