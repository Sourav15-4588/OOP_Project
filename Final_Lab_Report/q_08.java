// 8. Write a program to give a simple example for abstract class.

abstract class AbstractExample {
    public abstract void display();
    public void showData(){
        System.out.println("SOURAV KUMAR DAS");
    }
}



public class child extends AbstractExample{
    public void display(){
        System.out.println("ID 213-15-4588");
    }

    public static void main(String args[]){
        child ob = new child();
        ob.display();
        ob.showData();
    }
}
