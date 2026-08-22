// Write a program that takes a number and prints its max value without using an if statement.

import java.util.Scanner;

public class P006 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);


        System.out.print("pls enter Number 1 : ");
        int n = input.nextInt(); //Enter n
        
        System.out.print("pls enter Number 2 : ");
        int m = input.nextInt(); //Enter m

         
        int min = Math.max(n, m);

        System.out.println("MAX : " + min);

    }//end of main
}//end of class
