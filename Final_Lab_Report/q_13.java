//  13. Write a program to find the Fibonacci numbers using Recursion.

import java.util.*;
public class fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
     System.out.print("Enter a number you want to see fibonacci numbers : ");
        fibonacci f = new fibonacci();
        int num=sc.nextInt();
        f.seeFibonacci(0, num);
    }

    private int fibo(int n){
        if(n==0) return 0;
        else if(n==1 || n==2) return 1;
        else return fibo(n-1)+fibo(n-2); 
    }

    public void seeFibonacci(int n, int lim){
        if(n==lim) {
            System.out.println();
            return;
        }
        int fi=fibo(n);
        System.out.print(fi+" ");
        seeFibonacci(n+1, lim);
    }
}
