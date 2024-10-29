public class Prg_1_Static_Inner_Class {
    static class StaticInner {
        void display() {
            System.out.println("This is a Static Inner Class.");
        }
    }

    public static void main(String[] args) {
        Prg_1_Static_Inner_Class.StaticInner inner = new Prg_1_Static_Inner_Class.StaticInner(); // Creating instance of static inner class
        inner.display();
    }
}
