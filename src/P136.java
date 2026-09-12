
import java.util.Scanner;

// Write a program that takes 5 numbers and prints them from last to first.
public class P136 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int m = 0;
        System.out.print("Enter Number N : ");
        n = input.nextInt();

        if (n % 2 == 0) {
            m = n / 2;
        } else {
            m = n / 2 + 1;
        }
        int A[];
        A = new int[n];
        for (int x = 0; x < n; x++) {
            System.out.print("Enter Number " + (x) + " : ");
            A[x] = input.nextInt();
        }

        int temp = 0;

        for (int x = 0; x < m; x++) {
            temp = A[x];
            A[x] = A[n - (x + 1)];
            A[n - (x + 1)] = temp;
        }

        for (int x = 0; x < n; x++) {
            System.out.print(A[x] + "  ");
        }

    }
}
