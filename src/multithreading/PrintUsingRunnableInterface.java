package multithreading;

public class PrintUsingRunnableInterface implements Runnable {

	public void run() {
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		PrintUsingRunnableInterface helloRunnable = new PrintUsingRunnableInterface();
		Thread thread = new Thread(helloRunnable);
		thread.start();
	}
}
