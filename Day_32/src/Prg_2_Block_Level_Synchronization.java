class msg{
    public void show(String name){
        for(int i=0;i<50;i++){
            System.out.println("Student At Left Side Of Crossing");
        }
        synchronized (this){
            for(int i=0;i<3;i++){
                System.out.println("Cross The Railway Crossing "+ name);
            }
        }
        for(int i=0;i<50;i++){
            System.out.println("Student At Right Side Of Crossing");
        }
    }
}
class mythread extends Thread{
    msg m;
    String name;
    mythread(msg m,String name) {
        this.m = m;
        this.name = name;
    }
    public void run(){
        m.show(name);
        }
}
public class Prg_2_Block_Level_Synchronization {
    public static void main(String[] args) {
        System.out.println("Implementing Block Level Synchronization :)");
        msg m= new msg();
        mythread t1 =new mythread(m,"Naman");
        mythread t2 =new mythread(m,"Aman");
        t1.start();
        t2.start();
    }
}
