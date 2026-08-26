// Write a program that takes 20 numbers and prints the numbers that are greater than the average of the 20
// entered numbers.

import java.util.Scanner;

// Write a program that takes 5 numbers and prints them from last to first.
public class P123 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A[] = new int[20];
        int sum = 0;

        for (int x = 0; x < 20; x++) {
            System.out.print("Enter Number " + (x + 1) + " : ");
            A[x] = input.nextInt();
            sum += A[x];

        }
        double avg = sum / 20;
        System.out.println("avg is : " + avg);
        for (int x = 0; x < 20; x++) {
            if (A[x] > avg) {
                System.out.print(A[x] + "  ");
            }
        }

    }
}
