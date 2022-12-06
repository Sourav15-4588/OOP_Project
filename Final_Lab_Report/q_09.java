/*
9. Write a program to create interface A in this interface we have two method meth1 and
meth2. Implements this interface in another class named MyClass.
*/

public interface Aa {
    public int meth1(int a);
    public void meth2(int a);
}



import java.util.*;
public class MyClass implements Aa{
    public int meth1(int a){
        return a*a;
    }

    public void meth2(int a){
        System.out.println(a);
    }


    public static void main(String args[]){
        MyClass ob = new MyClass();
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        System.out.println("Square of "+a+" = "+ob.meth1(a));
        ob.meth2(a);
    }
}
