package MultiThreading;

public class ExtendThread extends Thread{

	public ExtendThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {

		System.out.println("Thread : "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		ExtendThread extendThread = new ExtendThread("Thread-1");
		extendThread.start();
	}

}
