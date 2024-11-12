class Mythread1 extends Thread{
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("I Am 3 Sec Delayer");
                Thread.sleep(3000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class Mythread2 extends Thread{
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("I Am 5 Sec Delayer");
                Thread.sleep(5000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class Sleep_Method_MultiThreading {
    public static void main(String[] args) {
        System.out.println("Implementing Sleep Method In Multi Threading");
        Mythread1 thread1 = new Mythread1();
        Mythread2 thread2 = new Mythread2();
        thread1.start();
        thread2.start();
    }
}
