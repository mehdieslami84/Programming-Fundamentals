// Write a program that prints the even of divisors of a given number.

import java.util.Scanner;

public class P047 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();

        int count = 0;

        while (n > 0) {
            if ((n % 10) % 2 != 0) {
                count++;
            }

            n /= 10;
        }

        System.out.println("count odd of digits:  : " + count);
    }//end of main
}//end of class
