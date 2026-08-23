// Write a program that prints the even of divisors of a given number.

import java.util.Scanner;

public class P042 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println("sum of digits:  : " + sum);
    }//end of main
}//end of class
