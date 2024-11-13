class myithread extends Thread{
    @Override
    public void run() {
        try{
            for(int i=0;i<10;i++){
                System.out.println("Running Thread");
                Thread.sleep(2000);
            }
        }
        catch(Exception e){
            System.out.println("Here Thread Got Interrupted");
            System.out.println(e);
        }
    }
}
public class Interrupt_Method_Multi_Threading {
    public static void main(String[] args) {
        System.out.println("Implementing The Interrupt Method");
        myithread ti1 = new myithread();
        ti1.start();
        ti1.interrupt();

    }
}
