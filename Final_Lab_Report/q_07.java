/*
7. Write a program to create a class named shape. In this class we have three sub classes
circle, triangle and square each class has two member function named draw () and erase ().
Create these using polymorphism concepts.
*/

public class Shape {
    public String name="Shape of Object";
    public void draw(){
        name="Shape of Object";
        System.out.println("A "+name+"is printed");
    }
    public void erase (){
        name="Shape of Object";
        System.out.println(name+" is erased");
    }
}



public class circle extends Shape{
    public void draw(){
        System.out.println("A "+name+"is printed");
    }
    public void erase (){
        System.out.println(name+" is erased");
    }
}



public class triangle extends Shape{
    public void draw(){
        System.out.println("A "+name+"is printed");
    }
    public void erase (){
        System.out.println(name+" is erased");
    }
}



public class square extends Shape{
    public void draw(){
        System.out.println("A "+name+"is printed");
        super.draw();
    }
    public void erase (){
        System.out.println(name+" is erased");
        super.erase();
    }
  
    public static void main(String args[]){
        square s = new square();
        triangle t = new triangle();
        circle c = new circle();
        s.name="Square";
        t.name="Triangle";
        c.name="Circle";
        c.draw();
        t.draw();
        s.draw();
        c.erase();
        t.erase();
        s.erase();
    }
}
