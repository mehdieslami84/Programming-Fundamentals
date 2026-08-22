// Write a program that prints the even of divisors of a given number.

import java.util.Scanner;

public class P029 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number 1 : ");
        int min1 = input.nextInt();
        System.out.print("Please Enter Number 2 : ");
        int min2 = input.nextInt();
        if (min1 > min2) {
            int temp = 0;
            temp = min1;
            min1 = min2;
            min2 = min1;
        }
        for (int x = 3; x <= 100; x++) {
            System.out.print("Please Enter Number " + x + "  :  ");
            int n = input.nextInt();
            if (n < min1) {
                min2 = min1;
                min1 = n;
            }
            if (n > min1 && n < min2) {
                min2 = n;
            }

        }
        System.out.println("       min 1 is  : " + min1 + "    min 2 is : " + min2);
    }//end of main
}//end of class
