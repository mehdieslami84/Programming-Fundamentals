// Write a program that takes 20 numbers and prints them from last to first.

import java.util.Scanner;

public class P122 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A[] = new int[20];
        for (int x = 0; x < 20; x++) {
            System.out.print("Enter Number " + (x + 1) + " : ");
            A[x] = input.nextInt();
        }
        for (int x = 19; x >= 0; x--) {
            System.out.print(A[x] + "  ");

        }

    }
}
