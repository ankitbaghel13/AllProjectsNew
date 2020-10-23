package MinePCWith1P1C;

public class PC {

	private int i=1;
	boolean increment = false;
	//private String threadName = Thread.currentThread().getName();
	//private Object lock = new Object();


	public void produce() throws InterruptedException{

		//Thread.sleep(1000);
		synchronized (this) {
			while(i<=10){
				while(increment){
					wait();
				}
				System.out.println(Thread.currentThread().getName()+" - "+i);
				i++;
				increment = true;
				notify();
			}
		}
	}
	
	public void consume() throws InterruptedException{

		synchronized (this) {
			while(i<=10){
				while(!increment){
					wait();
				}
				System.out.println(Thread.currentThread().getName()+" - "+i);
				i++;
				increment = false;
				notify();
			}
		}
	}
}
