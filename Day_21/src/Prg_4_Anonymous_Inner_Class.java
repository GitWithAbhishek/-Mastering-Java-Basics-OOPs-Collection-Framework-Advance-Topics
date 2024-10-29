public class Prg_4_Anonymous_Inner_Class {
    void method() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is an Anonymous Inner Class.");
            }
        };

        Thread thread = new Thread(runnable); // Creating a thread to run the anonymous inner class
        thread.start();
    }

    public static void main(String[] args) {
        Prg_4_Anonymous_Inner_Class outer = new Prg_4_Anonymous_Inner_Class();
        outer.method(); // Calling method that contains the anonymous inner class
    }
}
