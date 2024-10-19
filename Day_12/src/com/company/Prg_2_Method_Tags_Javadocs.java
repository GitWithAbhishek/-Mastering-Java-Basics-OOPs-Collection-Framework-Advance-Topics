package com.company;
/**
 * This Is The Content For Description<br>
 * Here We Are Going To Apply HTML <i>CSS Styling</i>
 * @author GetWithAbhishek
 * @see <a href="https://github.com/GitWithAbhishek" target="blank">Github</a>
 * @version Day_12_program_2
 * @since 19-10-2024
 */
public class Prg_2_Method_Tags_Javadocs {
    /**
     *
     * @param args This Is varargs
     */
    public static void main(String[] args) {
        System.out.println("This Is Method Tag Javadocs Code");
    }

    /**
     * Hello This Is Addition Method
     * @param a This Is The First Number
     * @param b This Is The Second Number
     * @return This Is The Result Number
     * @throws Exception If Both Are Negative Then Exception Is Thrown
     * @deprecated This Method Is Deprecated Please Use Add Operator
     */
    public int add(int a,int b) throws Exception {
        if(a<0&&b<0){
            throw new Exception();
        }
        int c=a+b;
        return c ;
    }
}
