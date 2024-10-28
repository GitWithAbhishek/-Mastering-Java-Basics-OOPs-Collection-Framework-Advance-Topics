class Prg_1_Static_Keyword {
    // Static variable
    static int count;

    // Static block
    static {
        count = 10;
        System.out.println("Static block executed. Initial count set to " + count);
    }

    // Constructor to increment count for each object created
    Prg_1_Static_Keyword() {
        count++;
        System.out.println("Constructor called. Count is now " + count);
    }

    // Static method
    static void displayCount() {
        System.out.println("Current count is " + count);
    }

    public static void main(String[] args) {
        // Call static method directly with class name
        Prg_1_Static_Keyword.displayCount();

        // Creating objects to observe the effect on static variable
        Prg_1_Static_Keyword obj1 = new Prg_1_Static_Keyword();
        Prg_1_Static_Keyword obj2 = new Prg_1_Static_Keyword();

        // Calling the static method again to see the updated count
        Prg_1_Static_Keyword.displayCount();
    }
}
