import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hallow Rectangle");
        int length,breadth;
        System.out.print("Enter the length -> ");
        length=sc.nextInt();
        System.out.print("Enter the breadth -> ");
        breadth=sc.nextInt();
        for(int i=0;i<breadth;i++){
            if(i==0||i==breadth-1){
                for(int j=0;j<length;j++){
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");
                for(int j=0;j<length-2;j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
