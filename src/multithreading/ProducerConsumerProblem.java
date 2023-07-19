package multithreading;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

public class ProducerConsumerProblem {
    public static final int MAX_SIZE = 10;
    public static AtomicBoolean programRunning = new AtomicBoolean(true);

    public static void main(String[] args) {
        LinkedList<Integer> buffer = new LinkedList<>();

        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();

        // Wait for Ctrl+C to stop the program
        try {
            System.out.println("Press Ctrl+C to stop the program.");
            while (programRunning.get()) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Producer implements Runnable {
    private LinkedList<Integer> buffer;

    public Producer(LinkedList<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int item = 1;
        while (ProducerConsumerProblem.programRunning.get()) {
            synchronized (buffer) {
                while (buffer.size() == ProducerConsumerProblem.MAX_SIZE) {
                    try {
                        System.out.println("Buffer is full. Producer is waiting...");
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                buffer.add(item);
                System.out.println("Produced: " + item);
                item++;
                buffer.notify(); // Notify the consumer that an item is available
            }

            try {
                Thread.sleep(1000); // Sleep to simulate some production time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private LinkedList<Integer> buffer;

    public Consumer(LinkedList<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (ProducerConsumerProblem.programRunning.get()) {
            synchronized (buffer) {
                while (buffer.isEmpty()) {
                    try {
                        System.out.println("Buffer is empty. Consumer is waiting...");
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int item = buffer.removeFirst();
                System.out.println("Consumed: " + item);
                buffer.notify(); // Notify the producer that an item is consumed
            }

            try {
                Thread.sleep(1500); // Sleep to simulate some consumption time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
