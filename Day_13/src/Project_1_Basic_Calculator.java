import java.util.Scanner;

public class Project_1_Basic_Calculator {

    // Method to display menu and get user's choice
    public static int showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");
        return scanner.nextInt();
    }

    // Methods for each operation
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error! Division by zero.");
            return 0;
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            int choice = showMenu();

            if (choice >= 1 && choice <= 4) {
                // Get user input for two numbers
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();
                double result = 0;

                // Perform operation based on choice
                switch (choice) {
                    case 1:
                        result = add(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case 2:
                        result = subtract(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case 3:
                        result = multiply(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case 4:
                        result = divide(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                }
            } else if (choice == 5) {
                keepRunning = false;
                System.out.println("Exiting calculator. Goodbye!");
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
