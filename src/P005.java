// Write a program that takes a number and prints its min value without using an if statement.

import java.util.Scanner;

public class P005 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);


        System.out.print("pls enter Number 1 : ");
        int n = input.nextInt(); //Enter n
        
        System.out.println("pls enter Number 2 : ");
        int m = input.nextInt(); //Enter m

         
        int min = Math.min(n, m);

        System.out.println("Min : " + min);

    }//end of main
}//end of class
