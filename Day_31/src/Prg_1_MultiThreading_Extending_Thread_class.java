class Mythread1 extends Thread{
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("I Am Learning DSA");
            i++;
        }
    }
}
class Mythread2 extends Thread{
    public void run(){
        int i=0;
        while(i<40){
            System.out.println("I Am Learning Development");
            i++;
        }
    }
}
public class Prg_1_MultiThreading_Extending_Thread_class {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        t1.start();
        t2.start();

    }
}
