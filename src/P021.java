// Write a program that prints the even of divisors of a given number.

import java.util.Scanner;

public class P021 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();
        double count = 0;
        double sum = 0;
        double avg = 0;

        System.out.print(n + " = {");
        for (int x = 1; x < n; x++) {
            if (n % x == 0) {
                sum += x;
                count++;
                System.out.print(x + ",");
            }
        }

        System.out.println(n + "}");
        count++;
        sum += n;
        System.out.println("count is : " + count);
        System.out.println("sum is : " + sum);
        avg = sum / count;
        System.out.println("avg : " + avg);
    }//end of main
}//end of class
