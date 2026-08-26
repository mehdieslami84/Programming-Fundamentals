
import java.util.Scanner;

// Write a program that takes 5 numbers and prints them from last to first.
public class P127 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter Number N : ");
        n = input.nextInt();
        int A[];
        A = new int[n];
        for (int x = 0; x < n; x++) {
            System.out.print("Enter Number " + (x) + " : ");
            A[x] = input.nextInt();
        }
        for (int x = n - 1; x >= 0; x--) {
            System.out.print(A[x] + "  ");

        }

    }
}
