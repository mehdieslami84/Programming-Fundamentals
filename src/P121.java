
import java.util.Scanner;

// Write a program that takes 5 numbers and prints them from last to first.
public class P121 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A[] = new int[5];
        for (int x = 0; x < 5; x++) {
            System.out.print("Enter Number " + x + " : ");
            A[x] = input.nextInt();
        }
        for (int x = 4; x >= 0; x--) {
            System.out.print(A[x] + "  ");

        }

    }
}
