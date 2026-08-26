
import java.util.Scanner;

public class P130 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        long n = input.nextLong();

        int A[] = new int[100];
        int c = 0;

        while (n > 0) {

            A[c] = (int) (n % 2);
            c++;

            n /= 2;
        }

        System.out.print("Binary is : ");

        for (int x = c - 1; x >= 0; x--) {
            System.out.print(A[x]);
        }
    }
}
