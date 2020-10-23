package lambdaExpressions;

public class RunnableWithLambda {

	public static void main(String[] args) {

		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Inside child thread "+Thread.currentThread().getName());
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Inside main thread "+Thread.currentThread().getName());
		}
	}

}
