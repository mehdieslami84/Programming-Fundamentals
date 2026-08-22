// Write a program that counts the number of divisors of a given number.

import java.util.Scanner;

public class P016 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();
        int c = 1;

        System.out.print(n + " = {");
        for (int x = 1; x < n; x++) {
            if (n % x == 0) {
                c++;
                System.out.print(x + ",");
            }
        }
        System.out.println(n + "}");
        System.out.println("number of divisors : " + c);
    }//end of main
}//end of class
