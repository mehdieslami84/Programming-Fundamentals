// Write a program that takes 20 numbers and prints the numbers that are prime and greater than the
// average.

import java.util.Scanner;

public class P125 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A[] = new int[20];
        int sum = 0;
        int c = 0;

        for (int x = 0; x < 20; x++) {
            System.out.print("Enter Number " + (x + 1) + " : ");
            A[x] = input.nextInt();
            sum += A[x];

        }
        double avg = sum / 20;
        System.out.println("avg is : " + avg);
        for (int x = 0; x < 20; x++) {
            if (A[x] > avg) {

                int c2 = 0;
                for (int y = 1; y <= A[x]; y++) {
                    if (A[x] % y == 0) {
                        c2++;
                    }
                    if (c2 == 2) {
                        c++;
                    }
                }

            }
        }
        System.out.print("count of more than avg and in prime :  " + c);

    }
}
