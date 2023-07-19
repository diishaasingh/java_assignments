package multithreading;

public class PrintUsingThreadClass extends Thread {

	public void run() {
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		PrintUsingThreadClass thread = new PrintUsingThreadClass();
		thread.start();
	}
}
