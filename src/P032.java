// Write a program that prints the odd of divisors of a given number.

import java.util.Scanner;

public class P032 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();
        System.out.print(n + " = {");
        for (int x = 1; x <= n; x++) {
            if (n % x == 0 && x >= 10 && x <= 99) {

                System.out.print(x + ",");

            }
        }
        System.out.println("}");

    }//end of main
}//end of class
