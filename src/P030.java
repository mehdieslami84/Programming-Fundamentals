// Write a program that prints the even of divisors of a given number.

import java.util.Scanner;

public class P030 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number 1 : ");
        int max1 = input.nextInt();
        System.out.print("Please Enter Number 2 : ");
        int max2 = input.nextInt();
        if (max2 > max1) {
            int temp = 0;
            temp = max1;
            max1 = max2;
            max2 = temp;
        }
        for (int x = 3; x <= 100; x++) {
            System.out.print("Please Enter Number " + x + "  :  ");
            int n = input.nextInt();
            if (n > max1) {
                max2 = max1;
                max1 = n;
            }
            if (n > max2 && n < max1) {
                max2 = n;
            }

        }
        System.out.println("       max 1 is  : " + max1 + "    max 2 is : " + max2);
    }//end of main
}//end of class
