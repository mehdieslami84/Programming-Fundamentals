// Write a program that prints the even of divisors of a given number.

import java.util.Scanner;

public class P025 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();

        int f = 1;

        for (int x = 1; x <= n; x++) {
            f *= x;
        }

        System.out.println("fact is : " + f);

    }//end of main
}//end of class
