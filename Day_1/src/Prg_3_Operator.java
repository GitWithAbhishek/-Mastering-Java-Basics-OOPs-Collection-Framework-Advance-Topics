public class Prg_3_Operator {
    public static void main(String[] args) {
        int num1=10,num2=5;
        int Result;
        System.out.println("We Are Going To Discuss The Types Of Operators");
                                        /* Arithmetic Operator  */

        // 1) Addition
        Result = num1+num2;
        System.out.println("Addition is performed And The Result is "+Result);

        // 2) Subtraction
        Result = num1-num2;
        System.out.println("Subtraction is performed And The Result is "+Result);

        // 3) Multiplication
        Result = num1*num2;
        System.out.println("Multiplication is performed And The Result is "+Result);

        // 4) Division
        Result = num1/num2;
        System.out.println("Division is performed And The Result is "+Result);

        // 5) Modulus
        Result = num1%num2;
        System.out.println("Modulus is performed And The Result is "+Result);
                                            /*  Unary Operator  */
        // 1) Pre Increment
        Result = ++num1;
        System.out.println("Pre Increment is performed And The Result is "+Result);

        // 2) Pre Decrement
        Result = --num1;
        System.out.println("Pre Decrement is performed And The Result is "+Result);

        // 3) Post Increment
        Result = num1++;
        System.out.println("Post Increment is performed And The Result is "+Result);

        // 4) Post Decrement
        Result = num1--;
        System.out.println("Post Decrement is performed And The Result is "+Result);

                                              /*Assignment Operator*/
        // 1) Equals to
        Result = num1;
        System.out.println("Equals To is performed And The Result is "+Result);

        // 2) Addition Equals to
        Result += num1;
        System.out.println("Addition Equals to is performed And The Result is "+Result);

        // 3) Subtraction Equals to
        Result -= num1;
        System.out.println("Subtraction Equals to is performed And The Result is "+Result);

        // 4) Multiplication Equals to
        Result *= num1;
        System.out.println("Multiplication Equals to is performed And The Result is "+Result);

        // 5) Division Equals to
        Result /= num1;
        System.out.println("Division Equals to is performed And The Result is "+Result);

                                        /* Comparison Operator */
        // 1) = =
        System.out.print("The Result of num1 is equals to num2 is ");
        System.out.println(num1 == num2);

        // 2) >=
        System.out.print("The Result of num1 is greater than equals to num2 is ");
        System.out.println(num1 >= num2);

        // 3) <=
        System.out.print("The Result of num1 is smaller than equals to num2 is ");
        System.out.println(num1 <= num2);

        // 4) !=
        System.out.print("The Result of num1 is not equals to num2 is ");
        System.out.println(num1 != num2);

                                       /* Logical Operator */
        // 1) And Operator
        System.out.print("The Result of num1 AND num2 is ");
        System.out.println(num1>15 && num2<50);

        // 2) OR Operator
        System.out.print("The Result of num1 OR num2 is ");
        System.out.println(num1>15 || num2<50);

        // 3) NOT Operator
        System.out.print("The Result of num1 AND num2 is ");
        System.out.println(num1!=num2);

                                        /*Bitwise Operator*/
        // 1) Bitwise And Operator
        System.out.print("The Result of num1 BITWISE AND num2 is ");
        System.out.println(num1&num2);

        // 1) Bitwise Or Operator
        System.out.print("The Result of num1 BITWISE OR num2 is ");
        System.out.println(num1|num2);

    }
}
