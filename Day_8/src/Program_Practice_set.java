import java.util.Scanner;

public class Program_Practice_set {
    //Question 1 Function
    static void table(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }

    // Question 2 Function
    static void pattern(){
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // Question 3 Function
    static int natural_num_sum(int n){
        if(n==0){
            return 0;
        }
        else{
            return (n+natural_num_sum(n-1));
        }
    }

    // Question 4 Function
    static int fabo(int x){
        if(x==0||x==1){
            return x;
        }
        else{
            return (fabo(x-1)+fabo(x-2));
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // Question 1
        System.out.println("WAP through method to print multiplication table of a number n");
        int num= sc.nextInt();
        table(num);

        //Question 2
        System.out.println("WAP through Method To Print Following Pattern");
        /*
        *
        * *
        * * *
        * * * *
         */
        pattern();

        // Question 3
        System.out.println("Write a Recursive function to calculate sum of first n natural number");
        int n=sc.nextInt();
        int result=natural_num_sum(n);
        System.out.println("The Sum Is "+result);

        // Question 4
        System.out.println("WAP TO Print Fabonnaci Series");
        int upper_bound=sc.nextInt();
        int res_fab;
        for(int i=1;i<=upper_bound;i++){
            res_fab=fabo(i);
            System.out.print(res_fab+" ");
        }

    }
}
