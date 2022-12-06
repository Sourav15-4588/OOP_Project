/*
17. Write a program for example of try and catch block with finally clause. In this check
whether the given array size is negative or not.
  */
package finally_key;

import java.util.Scanner;

public class Main {
    int re(int b){
        int[] a={121, 156, 451, 111, 999};
    try {
        if(b<0) throw new NegativeArraySizeException();
        System.out.println("Index is Positive");
        return a[b];

    }
    catch(Exception e){
        System.out.println(e);
    }
    finally {
        System.out.println("Clear All");
    }
        return 0;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Main ob = new Main();
        System.out.println("Enter the index you want to see the value");
        int i=s.nextInt();
        System.out.println("Value at "+i+"th Index is "+ob.re(i));
    }
}
