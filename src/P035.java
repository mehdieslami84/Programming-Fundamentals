// Write a program that prints the odd of divisors of a given number.

import java.util.Scanner;

public class P035 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        double n = input.nextInt();
        double count = 0;
        double sum = 0;
        System.out.print(n + " = {");

        for (int x = 1; x <= n; x++) {
            if (n % x == 0 && x >= 10 && x <= 99) {

                System.out.print(x + ",");
                count++;
                sum += x;
            }
        }
        System.out.println("}");
        System.out.println("count is : " + count);
        System.out.println("sum is : " + sum);
        System.out.println("avg is : " + sum / count);

    }//end of main
}//end of class
