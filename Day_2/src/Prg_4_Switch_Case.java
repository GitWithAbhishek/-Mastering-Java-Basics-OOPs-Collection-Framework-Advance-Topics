import java.util.Scanner;

public class Prg_4_Switch_Case {
    public static void main(String[] args) {
        System.out.println("Enter The Rating Btw 1 to 3 \n");
        Scanner sc = new Scanner(System.in);
        int rating=sc.nextInt();
        switch(rating){
            case 1:
                System.out.println("Poor Facility");
                break;
            case 2:
                System.out.println("Average Facility");
                break;
            case 3:
                System.out.println("Best Facility");
                break;
            default:
                System.out.println("You Have Entered Wrong Input");

        }
    }
}
