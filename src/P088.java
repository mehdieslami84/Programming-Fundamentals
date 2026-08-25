// Write a program that takes a number and prints its equivalent in base 16

import java.util.Scanner;

public class P088 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        long n = input.nextInt();
        String s = "";
        while (n > 0) {
            long r = n % 16;

            if (r < 10) {
                s = r + s;
            } else {
                s = (char) (r + 55) + s;
            }

            n = n / 16;
        }
        System.out.println(s);
    }//end of main
}//end of class
