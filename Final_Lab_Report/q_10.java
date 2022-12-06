// 10. Write a program to give example for multiple inheritance in Java.

public interface Aa {
    public int meth1(int a);
    public void meth2(int a);
}



public interface Bb {
    public void show();
}



import java.util.*;
public class MyClass implements Aa, Bb{
    public int meth1(int a){
        return a*a;
    }
    public void show(){
        System.out.println("Sourav Kumar Das");
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
        ob.show();
    }
}
