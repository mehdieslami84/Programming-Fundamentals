// Write a program that prints the even of divisors of a given number.

import java.util.Scanner;

public class P027 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number 1 : ");
        int n = input.nextInt();
        int min = n;
        for (int x = 2; x <= 100; x++) {
            System.out.print("Please Enter Number " + x + "  :  ");
            n = input.nextInt();
            if (min > n) {
                min = n;
            }

        }

        System.out.println("min is  : " + min);

    }//end of main
}//end of class
