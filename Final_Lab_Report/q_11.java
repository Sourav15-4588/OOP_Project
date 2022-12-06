/*  11. Write a program to create interface named test. In this interface the member function is square. Implement this interface in arithmetic class. Create one new class called ToTestInt
in this class use the object of arithmetic class. 
*/

public interface test {
    public int square(int a);
}


public class arithmatic implements test{
    public int square(int a){
        return a*a;
    }
}


import java.util.*;
public class ToTestInt {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        arithmatic ob = new arithmatic();
        int arm=s.nextInt();
        System.out.println("Output : "+ob.square(arm));
    }
}
