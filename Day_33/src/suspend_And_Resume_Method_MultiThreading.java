class mythread1 extends Thread {
    private boolean suspended = false;

    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println("My Name is Thread 1");

                // Check if thread is suspended
                while (suspended) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public synchronized void suspendThread() {
        suspended = true;
    }

    public synchronized void resumeThread() {
        suspended = false;
        notify();
    }
}

class mythread2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("My Name is Thread 2");
        }
    }
}

public class suspend_And_Resume_Method_MultiThreading {
    public static void main(String[] args) {
        System.out.println("Implementing The Suspend And Resume Method");

        mythread1 th1 = new mythread1();
        mythread2 th2 = new mythread2();

        th1.start();
        th1.suspendThread(); // Suspend Thread 1
        th2.start();

        try {
            Thread.sleep(1000); // Allow Thread 2 to run
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        th1.resumeThread(); // Resume Thread 1
    }
}
