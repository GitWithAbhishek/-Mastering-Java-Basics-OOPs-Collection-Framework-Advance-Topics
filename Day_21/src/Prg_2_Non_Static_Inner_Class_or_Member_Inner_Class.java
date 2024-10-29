public class Prg_2_Non_Static_Inner_Class_or_Member_Inner_Class {
    class Inner {
        void display() {
            System.out.println("This is a Non-Static (Member) Inner Class.");
        }
    }

    public static void main(String[] args) {
        Prg_2_Non_Static_Inner_Class_or_Member_Inner_Class outer = new Prg_2_Non_Static_Inner_Class_or_Member_Inner_Class();         // Outer class instance
        Prg_2_Non_Static_Inner_Class_or_Member_Inner_Class.Inner inner = outer.new Inner(); // Non-static inner class instance
        inner.display();
    }
}
