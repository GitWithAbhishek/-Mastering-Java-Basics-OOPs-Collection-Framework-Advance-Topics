class Table{
    public synchronized void Print_table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(i*n);
        }
    }
}
class thread1 extends Thread{
    Table t;
    thread1(Table t){

        this.t=t;
    }
    public void run()
    {
        t.Print_table(5);
    }
}
class thread2 extends Thread{
    Table t;
    thread2(Table t)
    {
        this.t=t;

    }
    public void run(){

        t.Print_table(7);
    }
}
public class Prg_1_Method_Level_Synchronization {
    public static void main(String[] args) {
        System.out.println("Print The Table Of 5 And 7");
        Table obj = new Table();
        thread1 t1 = new thread1(obj);
        thread2 t2 = new thread2(obj);
        t1.start();
        t2.start();
    }
}
