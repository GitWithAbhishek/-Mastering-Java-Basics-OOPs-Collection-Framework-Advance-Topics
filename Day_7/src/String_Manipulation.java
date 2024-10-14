import java.sql.SQLOutput;
import java.util.Arrays;

public class String_Manipulation {
    public static void main(String[] args) {
        System.out.println("There Are Two Method To Initialize A String");
        // Method 1
        String First_name;
        First_name = new String("Aman");
        System.out.println("The First Name Is "+First_name);
        // Method 2
        String Last_name = "Pandey";
        System.out.println("The Last Name Is "+Last_name);
        // Some Commonly Used String Functions
        System.out.println("Printing the length of First Name String - "+First_name.length());
        System.out.println("Printing the First Name String into lowercase - "+First_name.toLowerCase());
        System.out.println("Printing the First Name String into uppercase - "+First_name.toUpperCase());
        System.out.println("Printing the Substring of First Name String - "+First_name.substring(2,4));
        System.out.println("Replacing A with Na In The First Name - "+First_name.replace("A","Na"));
        System.out.println("Checking Weather a Given Start With Particular String Or Char - "+First_name.startsWith("Na"));
        System.out.println("Checking Weather a Given ends With Particular String Or Char - "+First_name.endsWith("n"));
        System.out.println("Printing The Char Present On A Particular Index - "+Last_name.charAt(4));
        System.out.println("Printing The Index Of The Particular Char Present in Given String - "+Last_name.indexOf('y'));
        System.out.println("Printing The Index Of The Particular Char Present in Given String With Fixed Starting Value - "+First_name.indexOf('m',3));
        System.out.println("Printing The Last Index Of The Particular Char Present in Given String - "+First_name.lastIndexOf('a'));
        System.out.println("Printing The Last Index Of The Particular Char Present in Given String With Fixed Starting Value - "+First_name.lastIndexOf('a',1));
        System.out.println("Checking Weather The Given String Is Equals (Case Sensitive)- "+Last_name.equals("pandey"));
        System.out.println("Checking Weather The Given String Is Equals (Not Case Sensitive) - "+Last_name.equalsIgnoreCase("pandey"));
        // Trim Function
        String full_trim ="    Hello   ";
        System.out.println("Full Trimming - "+full_trim.trim());

        // There Are Multiple Ways To Print In Java
        System.out.println("Print In New Line");
        System.out.print("Print In Same Line");
        System.out.println();
        int a=5;
        System.out.printf("Print using format specifiers %d",a);

        //Escape Sequence Character
        System.out.println();
        System.out.println("Hello \nNow New Line \t Now New tab \' Now Single Quote");
    }
}
