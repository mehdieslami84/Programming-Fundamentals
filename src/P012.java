// Write a program that prints the divisors of a given number.

import java.util.Scanner;

public class P012 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();
        System.out.print(n + " = {");
        for (int x = 1; x < n; x++) {
            if (n % x == 0) {
                System.out.print(x + ",");
            }
        }
        System.out.print(n + "}");

    }//end of main
}//end of class
