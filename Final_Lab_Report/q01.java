import java.util.*;

public class Room {
    int roomno;
    String roomtype;
    float roomarea;
    boolean ACmachine;
    public void setData(int a, String b, float c, boolean d){
        this.roomno=a;
        this.roomtype=b;
        this.roomarea=c;
        this.ACmachine=d;
    }
  
    public void displayData()
    {
        System.out.println("Room No = "+this.roomno);
        System.out.println("Room Type = "+this.roomtype);
        System.out.println("Room Area = "+this.roomarea);
        System.out.println("AC Machine = "+this.ACmachine);

    }
  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Room r1 = new Room();
        System.out.print("Enter Room No : ");
        int a=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Room Type : ");
        String b=sc.nextLine();
        System.out.print("Enter Room Area : ");
        float c=sc.nextFloat();
        System.out.print("Enter AC Machine : ");
        boolean d=sc.nextBoolean();
        r1.setData(a,b,c,d);
        r1.displayData();
    }
}
