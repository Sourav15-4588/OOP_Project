// 18. Write a program to describe usage of throws clause.

package Use_of_Throws;

import java.util.*;

public class TheowsClause {

    public static int fun(int x, int y) throws ArithmeticException{
        return x/y;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TheowsClause ob = new TheowsClause();
        int a, b;
        System.out.println("Enter two numbers ");
        a=s.nextInt();
        b=s.nextInt();
        try {
            System.out.println("Result of "+a+"/"+b+" = "+fun(a, b));
        }
        catch(Exception e){
            System.out.println("Exception");
            System.out.println(e);
        }
    }
}
