import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit 5 tasks to the thread pool
        for (int i = 1; i <= 5; i++) {
            final int task = i;
            executor.execute(() -> {
                System.out.println("Task " + task + " is running by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // Simulate task processing
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        // Shutdown the thread pool after tasks are completed
        executor.shutdown();
    }
}
