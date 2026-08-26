// Write a program that takes 20 numbers and prints how many of the numbers are greater than the average.

import java.util.Scanner;

// Write a program that takes 5 numbers and prints them from last to first.
public class P124 {

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
                c++;
            }
        }
        System.out.print("count of more than avg :  " + c);

    }
}
