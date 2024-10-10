public class Prg_1_While_Loop {
    public static void main(String[] args) {
        System.out.println("We Are Going To Print Hello India Five Times ");
        int n=0;
        while(n<5){
            System.out.println("Hello India");
            n++;
        }
/*
We Are Going To Print This Pattern Using While
*
* *
* * *
* * * *
* * * * *
 */
        int i=1;
        while(i<=5){
            int j=0;
            while(j<i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
