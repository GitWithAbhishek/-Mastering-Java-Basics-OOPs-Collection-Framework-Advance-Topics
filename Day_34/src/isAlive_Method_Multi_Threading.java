class my_thread extends Thread{
    @Override
    public void run() {
        System.out.println("I Am Aman");
    }
}
public class isAlive_Method_Multi_Threading {
    public static void main(String[] args) {
        System.out.println("Implementing isAlive Method");

        my_thread t1 =new my_thread();
        my_thread t2 =new my_thread();

        t1.start();
        System.out.println("Is T1 Thread Is Alive "+t1.isAlive());
        System.out.println("Is T2 Thread Is Alive "+t2.isAlive());
        t2.start();

    }
}
