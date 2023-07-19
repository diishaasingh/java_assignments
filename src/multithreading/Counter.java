package multithreading;

public class Counter {
	private int counter;

	public Counter() {
		counter = 0;
	}

	public synchronized void increment() {
		counter += 1;
	}

	public synchronized void decrement() {
		counter -= 1;
	}

	public int getCounter() {
		return counter;
	}

	public static void main(String[] args) {
		Counter myCounter = new Counter();

		System.out.println("Initial Counter value: " + myCounter.getCounter());

		Thread incrementThread = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				myCounter.increment();
			}
		});
		incrementThread.start();

		Thread decrementThread = new Thread(() -> {
			for (int i = 0; i < 3; i++) {
				myCounter.decrement();
			}
		});
		decrementThread.start();

		try {
			incrementThread.join();
			decrementThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Counter value after operations: " + myCounter.getCounter());
	}
}
