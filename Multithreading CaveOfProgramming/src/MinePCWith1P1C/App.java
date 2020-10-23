package MinePCWith1P1C;

public class App {

	public static void main(String[] args) {

		PC pc = new PC();
		
		try {
			//Thread prod = new Thread(()->pc.produce("Thread-1"));
			Thread prod = new Thread(new Runnable() {
	            @Override
	            public void run() {
	                    try {
							pc.produce();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
	            }
	        });
			//Thread cons = new Thread(()->pc.consume("Thread-2"));
			prod.setName("Thread-1");

	        Thread cons = new Thread(new Runnable() {
	            @Override
	            public void run() {
	                    try {
							pc.consume();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
	            }
	        });
			cons.setName("Thread-2");
	        
			prod.start();
			cons.start();
			
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
