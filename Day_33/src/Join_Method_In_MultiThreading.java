class MyThread extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}
public class Join_Method_In_MultiThreading {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        try {
            thread1.join(); // Main thread waits for thread1 to complete
        } catch (InterruptedException e) {}

        thread2.start();
    }
}
