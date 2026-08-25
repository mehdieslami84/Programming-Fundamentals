// Write a program that takes two base-8 numbers, computes and prints their sum and product.

import java.util.Scanner;

public class P084 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int mul = 1;
        for (int x = 1; x <= 2; x++) {
            System.out.print("Please Enter Number " + x + " : ");
            int n = input.nextInt();
            int p = 1;
            int d = 0;
            while (n > 0) {
                d = p * (n % 10) + d;
                p = p * 8;
                n /= 10;
            }

            sum += d;
            mul *= d;
        }

        int b = 0;
        int p = 1;

        while (sum > 0) {

            b = b + (sum % 8) * p;
            p = p * 10;
            sum /= 8;
        }
        System.out.println("sum is : " + b);
        b = 0;
        p = 1;

        while (mul > 0) {

            b = b + (mul % 8) * p;
            p = p * 10;
            mul /= 8;
        }

        System.out.println("mul is : " + b);
    }

}
