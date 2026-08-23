// Write a program that prints the even of divisors of a given number.

import java.util.Scanner;

public class P064 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int x = 1; x <= 100; x++) {
            System.out.print("Please Enter Number " + x + "  :  ");
            int n = input.nextInt();

            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
        }
        System.out.println("sum of digits:  : " + sum);
    }//end of main
}//end of class
