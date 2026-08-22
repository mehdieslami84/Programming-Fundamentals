// Write a program that takes a number and prints its absolute value without using an if statement.

import java.util.Scanner;

public class P004 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);


        System.out.print("pls enter Number : ");
        
        int n = input.nextInt(); //Enter n
        int m =n*n;
        System.out.println((int)Math.sqrt(m));
        
    }//end of main
}//end of class
