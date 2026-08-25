// Write a program that takes a base-2 number and converts it to base 8

import java.util.Scanner;

public class P087 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();
        int p = 1;
        int d = 0;
        while (n > 0) {
            d = p * (n % 10) + d;
            p = p * 2;
            n /= 10;
        }
        System.out.println("Decimal is  : " + d);

        p = 1;
        int b = 0;
        while (d > 0) {
            b = b + (d % 8) * p;
            p *= 10;
            d /= 8;

        }
        System.out.println(b);
    }
}
