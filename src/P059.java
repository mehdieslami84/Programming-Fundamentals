// Write a program that prints the even of divisors of a given number.

import java.util.Scanner;

public class P059 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();
        int c = 0;
        int x = 2;

        while (n > 1) {
            c = 0;
            while (n % x == 0) {
                c++;
                n /= x;
            }
            if (c != 0) {
                System.out.print(x + " ^ " + c + " + ");

            }

            x++;

        }
        System.out.println("0");
    }//end of main
}//end of class
