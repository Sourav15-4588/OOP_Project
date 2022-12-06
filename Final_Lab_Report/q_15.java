/* 
15. Create class box and box3d. box3d is extended class of box. The above two classes going
to fulfill following requirement
i. 
ii. 
iii. 	Include constructor.
set value of length, breadth, height
Find out area and volume.
Note: Base class and sub classes have respective methods and instance variables.
*/
  
import java.util.Scanner;
public class Box {
    private int height, breadth, length;
    public Box(){
        System.out.println("Constructor");
    }
    public void setData(int l, int b, int h){
        this.length=l;
        this.breadth=b;
        this.height=h;
    }
    public int getArea(){
        return length*breadth;
    }
    public int getVolume(){
        return breadth*height*length;
    }
}
class Box3d extends Box{
    public static void main(String[] args) {
        Box3d b1 = new Box3d();
        Scanner s = new Scanner(System.in);
        int l, b, h;
        System.out.print("Enter the value of length : ");
        l=s.nextByte();
        System.out.print("Enter the value of breadth : ");
        b=s.nextByte();
        System.out.print("Enter the value of : ");
        h=s.nextByte();
        b1.setData(l, b, h);
        int area=b1.getArea();
        int volume=b1.getVolume();
        System.out.println("Area of Box = "+area);
        System.out.println("Volume of Box = "+volume);
    }
}
