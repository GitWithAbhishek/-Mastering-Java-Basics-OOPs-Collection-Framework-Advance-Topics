import java.util.Scanner;

public class Project_2_String_Manipulation {

    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("\\s+", "").toLowerCase(); // Remove spaces and lowercase
        String reversed = reverseString(cleaned);
        return cleaned.equals(reversed);
    }

    // Method to count vowels and consonants
    public static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // Method to display menu and get user's choice
    public static int showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nChoose an operation:");
        System.out.println("1. Reverse String");
        System.out.println("2. Check Palindrome");
        System.out.println("3. Convert to Uppercase");
        System.out.println("4. Convert to Lowercase");
        System.out.println("5. Count Vowels and Consonants");
        System.out.println("6. Exit");
        System.out.print("Enter your choice (1-6): ");
        return scanner.nextInt();
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            int choice = showMenu();

            if (choice >= 1 && choice <= 5) {
                // Get user input for the string
                System.out.print("Enter a string: ");
                String input = scanner.nextLine();

                // Perform operation based on choice
                switch (choice) {
                    case 1:
                        System.out.println("Reversed String: " + reverseString(input));
                        break;
                    case 2:
                        System.out.println("Is Palindrome: " + isPalindrome(input));
                        break;
                    case 3:
                        System.out.println("Uppercase: " + input.toUpperCase());
                        break;
                    case 4:
                        System.out.println("Lowercase: " + input.toLowerCase());
                        break;
                    case 5:
                        countVowelsAndConsonants(input);
                        break;
                }
            } else if (choice == 6) {
                keepRunning = false;
                System.out.println("Exiting application. Goodbye!");
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
