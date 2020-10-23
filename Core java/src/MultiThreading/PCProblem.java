package MultiThreading;

import java.util.Vector;

public class PCProblem {

	public static void main(String[] args) {

		Vector<Integer> sharedQueue = new Vector<Integer>();
		int SIZE = 4;

		Thread producerThread = new Thread(new Producer(sharedQueue, SIZE),
				"Producer");
		Thread consumerThread = new Thread(new Consumer(sharedQueue, SIZE,
				producerThread), "Consumer");

		producerThread.start();
		consumerThread.start();
	}

}

class Producer implements Runnable {

	private final Vector<Integer> sharedQueue;
	private final int SIZE;

	public Producer(Vector<Integer> sharedQueue, int SIZE) {
		this.sharedQueue = sharedQueue;
		this.SIZE = SIZE;
	}

	@Override
	public void run() {
		for (int i = 1; i < 12; i++) {
			System.out.println("Producer trying to insert item : " + i);
			try {
				produce(i);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}

	}

	private void produce(int i) throws InterruptedException {

		synchronized (sharedQueue) {
			while (sharedQueue.size() == SIZE) {
				System.out.println("Queue is full "
						+ Thread.currentThread().getName()
						+ " is waiting, size : " + sharedQueue.size());
				sharedQueue.wait();
			}
		}

		synchronized (sharedQueue) {
			sharedQueue.add(i);
			System.out.println("Produced : " + i);
			sharedQueue.notifyAll();
		}
	}

}

class Consumer implements Runnable {

	private final Vector<Integer> sharedQueue;
	private final int SIZE;
	private final Thread producerThread;

	public Consumer(Vector<Integer> sharedQueue, int SIZE, Thread producerThread) {
		this.sharedQueue = sharedQueue;
		this.SIZE = SIZE;
		this.producerThread = producerThread;
	}

	@Override
	public void run() {

		while (true) {
			try {
				int temp = consume();

				if (temp == -1)
					break;

				System.out.println("Consumed element : " + temp + "\n");

				//Thread.sleep(50);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

	private int consume() throws InterruptedException {

		synchronized (sharedQueue) {
			while (sharedQueue.isEmpty()) {
				if (!producerThread.isAlive())
					return -1;
				System.out.println("Queue is empty, "
						+ Thread.currentThread().getName()
						+ " is waiting, size : " + sharedQueue.size());
				sharedQueue.wait();
			}
		}

		synchronized (sharedQueue) {
			sharedQueue.notifyAll();

			System.out.println();
			for (Integer i : sharedQueue) {
				System.out.print(i+" ");
			}
			System.out.println();
			
			return (Integer) sharedQueue.remove(0);
		}
	}

}
