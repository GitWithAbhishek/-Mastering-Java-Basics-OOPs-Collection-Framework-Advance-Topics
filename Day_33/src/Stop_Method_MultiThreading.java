class My_thread1 extends Thread {
    private volatile boolean running = true;

    public void run() {
        int i = 0;
        while (i < 50 && running) {
            System.out.println("I Am Learning DSA");
            i++;
        }
    }

    public void stopThread() {
        running = false;
    }
}

class My_thread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("I Am Learning Development");
            i++;
        }
    }
}

class My_thread3 extends Thread {
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("I Am Learning Java Advance");
            i++;
        }
    }
}

public class Stop_Method_MultiThreading {
    public static void main(String[] args) {
        My_thread1 t1 = new My_thread1();
        My_thread2 t2 = new My_thread2();
        My_thread3 t3 = new My_thread3();

        t1.start();
        t2.start();

        // Simulating a stop after some time
        try {
            Thread.sleep(100); // Let thread run briefly
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t1.stopThread(); // Stop thread 1 safely
        t3.start();
    }
}
