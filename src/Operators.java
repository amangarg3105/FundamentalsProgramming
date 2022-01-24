/**
 * @author amgarg
 */
public class Operators {

    public static void main(String[] args) {


       /* int a = 10;
        int b = 3;*/

       /* a = a + b;
        a += b;// a = a + b
        a *= b; // a = a * b
        a -=b; // a = a - b;
        a /=b; // a = a / b
        a %=b; // a = a % b*/


        boolean value = false;

        value = !value;

        System.out.println(value);

       /* double result;


        //Sum of two numbers
        result = (int) (a / b);

        System.out.println("Division of two numbers  " + a / b);*/

       /* //Sub of two numbers
        result = a - b;

        System.out.println(result);

        //Mul to two numbers
        result = a * b;
         System.out.println(result);

         //Div of two numbers (Quotient)
         result = a/b;

        System.out.println(result);

        result = a%b;
        System.out.println(result);
        */

        /*  */


        String str1 = "Hello";
        String str2 = "World";

        String str3 = str1 + str2;

        System.out.println(str3);


        //Relational operator;
/*

        int num1 = 10;
        int num2 = 5;

        boolean ans = num1 != num2; // That num1 is not equal to  num2
        System.out.println((num1 > num2) + " " + ans);
*/


        //Logical Operator
        boolean condition1 = true;
        boolean condition2 = true;

        boolean overallAns = condition1 || condition2;
        System.out.println(!overallAns);


       /* int a = 2;
        int b = 10;

        System.out.println(a == b);


       int result = a++ + a++;//10 + 12
       int result2 = b++ + ++b;
        System.out.println(result);*/


        int a = 11, b = 22, c;

        //Use the value of a and then increment it
        a++; // a = a + 1;
        ++a; // a = a+ 1;

        System.out.println(a);


        c = 2 * 5 /2 - 4 / 4 + 8;


        System.out.println("c=" + c);




    }
}