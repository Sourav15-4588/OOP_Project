/*14. Create class point with following instance variable and methods.
Instance variable: private int x, y. Constructors : public Point(), Point(int x, int y). 
Methods : public void setX(int x), setY(int y), setXY(int x, int y). 
Write a program to create a package named mypack and import it in point class.
*/

package mypack;
import java.util.*;
public class Point {
    private int x, y;
    public Point(){

    }
    public Point(int x, int y){
        System.out.println("Constructor");
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    public static void main(String[]  args){
        Point ob = new Point();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a=s.nextInt();
        System.out.print("Enter the value of b : ");
        int b=s.nextInt();
        ob.setX(a);
        ob.setY(b);
        System.out.println("Value of a, b : "+ob.x+" "+ob.y);
        System.out.print("Enter the value of x & y : ");
        a=s.nextInt();
        b=s.nextInt();
        ob.setXY(a,b);
        System.out.println("Value of x & y :"+ob.x+" "+ob.y);
    }
}
