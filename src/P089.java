// Write a program that takes a base-2 number and converts it directly to base 16

import java.util.Scanner;

public class P089 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        long n = input.nextInt();
        String s = "";
        long b = 0;
        long p = 1;
        while (n > 0) {
            b = (n % 10) * p + b;
            p *= 2;
            n /= 10;
        }
        while (b > 0) {
            long r = b % 16;

            if (r < 10) {
                s = r + s;
            } else {
                s = (char) (r + 55) + s;
            }

            b = b / 16;
        }
        System.out.println("Hex : " + s);
    }//end of main
}//end of class
