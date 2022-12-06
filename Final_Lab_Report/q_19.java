// 19. Write a program for creation of user defined exception.
  
package Exception;

import java.util.*;
 class myException extends Exception{
    @Override
    public String toString(){
        return "Something Went Wrong";
    }

     @Override
     public String getMessage() {
         return "Password is Wrong";
     }
 }


public class DefinedException {
     public static void main(String[] args){
         Scanner s = new Scanner(System.in);
         int i;
         System.out.println("Enter your pin");
         while(s.hasNextInt()){
             i=s.nextInt();
             if (i != 1150) {
                 try {
                     throw new myException();
                 }
                 catch (Exception e) {
                     System.out.println(e);
                     System.out.println(e.getMessage());
                     System.out.println("Enter your password again");
                 }
             }
             else {
                    System.out.println("Successfully Logged in\n");
                    break;
             }
         }
     }
}
