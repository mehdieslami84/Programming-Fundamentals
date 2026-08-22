// Write a program that prints the even of divisors of a given number.

import java.util.Scanner;

public class P020 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();
        int count = 0;

        System.out.print(n + " = {");
        for (int x = 2; x < n; x += 2) {
            if (n % x == 0) {
                count++;
                System.out.print(x + ",");
            }
        }
        if (n % 2 == 0) {
            System.out.println(n + "}");
            count++;
        } else {
            System.out.println("}");
        }
        System.out.println("count is : " + count);
    }//end of main
}//end of class
