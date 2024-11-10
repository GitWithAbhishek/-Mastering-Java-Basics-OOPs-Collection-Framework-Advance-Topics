class MyRunnablethread1 implements Runnable{
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("I Am Learning DSA");
            i++;
        }
    }
}
class MyRunnablethread2 implements Runnable{
    public void run(){
        int i=0;
        while(i<40){
            System.out.println("I Am Learning Development");
            i++;
        }
    }
}
public class Prg_2_MultiThreading_Runnable_Interface {
    public static void main(String[] args) {
        MyRunnablethread1 Bullet1 = new MyRunnablethread1();
        MyRunnablethread2 Bullet2 = new MyRunnablethread2();
        Thread Gun1 = new Thread(Bullet1);
        Thread Gun2 = new Thread(Bullet2);
        Gun1.start();
        Gun2.start();
    }
}
