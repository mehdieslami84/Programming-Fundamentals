// Write a program that prints the sum of divisors of a given number.

import java.util.Scanner;

public class P019 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();
        System.out.print(n + " = {");

        int sum = 0;

        for (int x = 2; x < n; x += 2) {
            if (n % x == 0) {
                sum += x;
                System.out.print(x + ",");
            }
        }
        System.out.println(n + "}");
        if (n % 2 == 0) {
            System.out.println("sum of divisors : " + (sum + n)); 
        }else {
            System.out.println("sum of divisors : " + sum);
        }
    }//end of main
}//end of class
