package multithreading;

import java.util.Map;

public class DisplayAllRunningThreads {
	public static void main(String[] args) {
		// Get all threads and their stack traces
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();

		// Iterate over the threads and display their information
		for (Map.Entry<Thread, StackTraceElement[]> entry : map.entrySet()) {
			Thread thread = entry.getKey();
			StackTraceElement[] stackTrace = entry.getValue();

			System.out.println("Thread Name: " + thread.getName());
			System.out.println("Thread State: " + thread.getState());
			System.out.println("Thread ID: " + thread.getId());

			// Display stack trace if available
			if (stackTrace != null && stackTrace.length > 0) {
				System.out.println("Stack Trace:");
				for (StackTraceElement stackTraceElement : stackTrace) {
					System.out.println("\t" + stackTraceElement);
				}
			}

			System.out.println("-------------------------------");
		}
	}
}
