// Public class can be accessed from anywhere
//public
class AccessModifiersExample {

    // Private variable - accessible only within this class
    private int privateVariable = 10;

    // Public variable - accessible from anywhere
    public int publicVariable = 20;

    // Protected variable - accessible within the package and subclasses
    protected int protectedVariable = 30;

    // Final variable - once initialized, it cannot be changed
    public final int CONSTANT_VALUE = 100;

    // Public method - accessible from anywhere
    public void publicMethod() {
        System.out.println("Public method");
        System.out.println("Private Variable: " + privateVariable);
    }

    // Private method - accessible only within this class
    private void privateMethod() {
        System.out.println("Private method");
    }

    // Protected method - accessible within the package and in subclasses
    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    // Final method - cannot be overridden by subclasses
    public final void finalMethod() {
        System.out.println("Final method");
    }
}

// Final class - cannot be extended by any other class
final class FinalClass {
    public void showMessage() {
        System.out.println("This is a final class.");
    }
}

// Subclass in the same package to demonstrate access
class SubClass extends AccessModifiersExample {
    public void display() {
        // Accessing protected and public members from superclass
        System.out.println("Protected Variable: " + protectedVariable);
        System.out.println("Public Variable: " + publicVariable);

        // Calling protected and public methods from superclass
        protectedMethod();
        publicMethod();
    }
}

// Main class to run the code
public class Prg_1_Access_Modifires {
    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();

        // Accessing public and protected variables and methods
        example.publicMethod();

        // Private members are inaccessible outside the class
        // example.privateVariable; // Error
        // example.privateMethod(); // Error

        // Public and final variables are accessible
        System.out.println("Public Variable: " + example.publicVariable);
        System.out.println("Constant Value: " + example.CONSTANT_VALUE);

        // Demonstrating the final class
        FinalClass finalClass = new FinalClass();
        finalClass.showMessage();

        // Accessing from subclass
        SubClass subClass = new SubClass();
        subClass.display();
    }
}