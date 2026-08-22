// Write a program that prints the odd of divisors of a given number.

import java.util.Scanner;

public class P013 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();
        System.out.print(n + " = {");
        for (int x = 1; x < n; x += 2) {
            if (n % x == 0) {
                System.out.print(x + ",");
            }
        }
        if (n % 2 == 0) {
            System.out.print("}");
        } else {
            System.err.print(n + '}');
        }

    }//end of main
}//end of class
