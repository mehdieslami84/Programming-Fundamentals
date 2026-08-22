// Write a program that prints the even of divisors of a given number.

import java.util.Scanner;

public class P024 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();

        int count = 0;

        for (int x = 1; x <= n; x++) {
            if (n % x == 0) {
                count++;

            }
        }
        if (count == 2) {
            System.out.println("yes becuse count is : " + count);

        } else {
            System.out.println("no becuse count is : " + count);
        }

    }//end of main
}//end of class
