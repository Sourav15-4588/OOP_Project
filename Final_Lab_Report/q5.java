import java.util.*;
public class overload {
    public int area(int height, int width){
        return height*width;
    }
    public double area(int redius){
        return 3.1416*redius;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        overload ob = new overload();
        System.out.println("Enter height & width of a rectangle :\nheight will consider as the redius of circle");
        int height=sc.nextInt();
        int width=sc.nextInt();
        System.out.println("Area of Rectangle : "+ob.area(height, width));
        System.out.println("Area of Circle : "+ob.area(height));
    }
}
Output :
