// Write a program that prints the even of divisors of a given number.

import java.util.Scanner;

public class P026 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;
        for (int x = 1; x <= 10; x++) {
            System.out.print("Please Enter Number : ");
            int n = input.nextInt();
            sum += n;
        }

        System.out.println("avg is  : " + sum / 10);

    }//end of main
}//end of class
