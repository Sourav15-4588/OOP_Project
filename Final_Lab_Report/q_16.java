/*
16. Write a program to give the example for association, aggregation and composition
concepts.
  */
package Question_16;

import java.sql.SQLOutput;

public class Phone {
    int code;

    void tune(){
        System.out.println("Riingetone & alerms");
    }
}

class Apple extends Phone {
    String name;

    void display() {
        System.out.println("Imported from Samsung");
        super.tune();
    }
}
class cloud extends Phone{
    public static void system(){
        System.out.println("I cloud");
    }

    public static void main(String[] args) {
        Apple ob = new Apple();
        ob.display();
        system();

    }
}
