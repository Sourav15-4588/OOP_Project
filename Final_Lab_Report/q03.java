import java.util.*;
public class example {
    String name;
    int age;
    public void setData(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
    }
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        example ob = new example();
        System.out.print("Enter Your Full Name : ");
        String name=sc.nextLine();
        System.out.print("Enter Your Age : ");
        int age=sc.nextInt();
        ob.setData(name, age);
        ob.display();
    }
}
