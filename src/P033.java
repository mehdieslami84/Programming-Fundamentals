// Write a program that prints the odd of divisors of a given number.

import java.util.Scanner;

public class P033 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();
        int sum = 0;

        System.out.print(n + " = {");

        for (int x = 1; x <= n; x++) {
            if (n % x == 0 && x >= 10 && x <= 99) {

                System.out.print(x + ",");
                sum += x;
            }
        }
        System.out.println("}");
        System.out.println("sum is : " + sum);

    }//end of main
}//end of class
