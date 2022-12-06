/*2. Write a program create a class ‘simpleobject‘. Using constructor, display the message
“Hello, simple object is created”. 
*/

public class simpleobject {
    public simpleobject(){
        System.out.println("Hello, simple object is created");
    }
    public static void main(String[] args){
        simpleobject s = new simpleobject();
        System.out.println("Constractor created");
    }
}
