public class Prg_3_Local_Inner_Class {
    void method() {
        class LocalInner {
            void display() {
                System.out.println("This is a Local Inner Class.");
            }
        }

        LocalInner inner = new LocalInner(); // Creating instance of local inner class within the method
        inner.display();
    }

    public static void main(String[] args) {
        Prg_3_Local_Inner_Class outer = new Prg_3_Local_Inner_Class();
        outer.method(); // Calling method that contains the local inner class
    }
}
