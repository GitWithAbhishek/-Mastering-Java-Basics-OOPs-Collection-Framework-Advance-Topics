class mythread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
public class Thread_Priority_Multi_Threading {
    public static void main(String[] args) {
        System.out.println("Taking A Look Of Thread Priority");
        mythread t1 = new mythread();
        mythread t2 = new mythread();
        mythread t3 = new mythread();

        t1.setName("I Am T1");
        t2.setName("I Am T2");
        t3.setName("I Am T3");

        t1.setPriority(1);
        t2.setPriority(5);
        t3.setPriority(10);

        t1.start();
        t2.start();
        t3.start();
    }
}
