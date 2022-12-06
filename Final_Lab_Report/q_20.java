// 20. Write a program to sort an ArrayList.

import java.util.*;

public class Arraysort {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of aray : ");
        int size=s.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the array elements :");
        for(int i=0; i<size; i++){
            array[i]=s.nextInt();
        }
        Arraysort ob = new Arraysort();
        ob.sort(array,size);
        ob.show(array,size);
    }
    private void sort(int ar[], int s){
        int temp;
        for(int i=0; i<s; i++){
            for(int j=0; j<s-1-i; j++){
                if(ar[j]>ar[j+1]){
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
    }
    private void show(int ar[], int s){
        System.out.print("Sorted Array : ");
        for(int i=0; i<s; i++){
            System.out.print(ar[i]);
            if(i<s-1)
                System.out.print(" ");
        }
        System.out.println();
    }
}
