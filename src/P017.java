// Write a program that prints the even of divisors of a given number.

import java.util.Scanner;

public class P017 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();
        int sum = 0;

        System.out.print(n + " = {");
        for (int x = 1; x < n; x += 2) {
            if (n % x == 0) {
                sum += x;
                System.out.print(x + ",");
            }
        }
        if (n % 2 == 0) {
            System.out.println("}");
        } else {
            System.err.println(n + '}');
        }
        System.out.println("sun is ; " + sum);
    }//end of main
}//end of class
