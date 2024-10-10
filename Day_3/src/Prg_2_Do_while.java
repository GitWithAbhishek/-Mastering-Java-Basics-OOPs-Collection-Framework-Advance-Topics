public class Prg_2_Do_while {
    public static void main(String[] args) {
        System.out.println("We Are Going To Print Hello India Five Times ");
        int n=0;
        do{
            System.out.println("Hello India");
            n++;
        }
        while(n<5);

        /*
We Are Going To Print This Pattern Using While
*
* *
* * *
* * * *
* * * * *
 */
        int i=1,j=0;
        do {
            do {
                System.out.print("* ");
                j++;
            }
            while(j<i);
            System.out.println();
            i++;
            j=0;
        }
        while(i<=5);

    }
}
