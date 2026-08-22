// Write a program that prints the even of divisors of a given number.

import java.util.Scanner;

public class P022 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();
        double count = 0;
        double sum = 0;
        double avg = 0;

        System.out.print(n + " = {");
        for (int x = 2; x < n; x += 2) {
            if (n % x == 0) {
                sum += x;
                count++;
                System.out.print(x + ",");
            }
        }
        if (n % 2 == 0) {
            System.out.println(n + "}");
            count++;
            sum += n;
        } else {
            System.out.println("}");
        }
        System.out.println("count is : " + count);
        System.out.println("sum is : " + sum);
        avg = sum / count;
        System.out.println("avg : " + avg);
    }//end of main
}//end of class
