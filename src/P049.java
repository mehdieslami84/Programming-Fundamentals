// Write a program that prints the even of divisors of a given number.

import java.util.Scanner;

public class P049 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();

        int mul = 1;

        while (n > 0) {
            if ((n % 10) % 2 == 0) {
                mul *= n % 10;
            }

            n /= 10;
        }

        System.out.println("mul of even digits:  : " + mul);
    }//end of main
}//end of class
