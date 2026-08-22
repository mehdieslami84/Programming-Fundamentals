// Write a program that prints the odd of divisors of a given number.

import java.util.Scanner;

public class P034 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();
        int count = 0;

        System.out.print(n + " = {");

        for (int x = 1; x <= n; x++) {
            if (n % x == 0 && x >= 10 && x <= 99) {

                System.out.print(x + ",");
                count++;
            }
        }
        System.out.println("}");
        System.out.println("count is : " + count);

    }//end of main
}//end of class
