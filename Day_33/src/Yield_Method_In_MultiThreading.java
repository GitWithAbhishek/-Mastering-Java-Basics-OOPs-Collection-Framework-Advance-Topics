class My_Thread1 extends Thread{
    @Override
    public void run() {
        String Name = Thread.currentThread().getName();
        for(int i=0;i<10;i++){
            System.out.println(Name);
            Thread.yield();
        }
    }
}
class My_Thread2 extends Thread{
    @Override
    public void run() {
        String Name = Thread.currentThread().getName();
        for(int i=0;i<10;i++){
            System.out.println(Name);
        }
    }
}
public class Yield_Method_In_MultiThreading {
    public static void main(String[] args) {
        System.out.println("Implementing Yield Method In MultiThreading");
        My_Thread1 t1 = new My_Thread1();
        My_Thread2 t2 = new My_Thread2();
        t1.start();
        t2.start();
    }
}
