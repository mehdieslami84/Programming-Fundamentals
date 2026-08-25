// Write a program that takes 100 numbers and prints how many of them are both perfect numbers and
// divisible by 2.

import java.util.Scanner;

public class P080 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c = 0;
        for (int x = 1; x <= 100; x++) {
            System.out.print("Please Enter Number " + x + " : ");
            int n = input.nextInt();
            int sum = 0;

            for (int y = 1; y < n; y++) {
                if (n % y == 0) {
                    sum += y;

                    if (sum == x && x % 2 == 0) {
                        System.out.println("its is right and even");
                        c++;
                    }
                }

            }

        }
        System.out.println(c);

    }//end of main
}//end of class
