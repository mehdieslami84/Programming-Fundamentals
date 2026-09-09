
import java.util.Scanner;

public class P137 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int A[] = new int[n];

        int cB = 0;
        int cC = 0;

        int B[] = new int[n];
        int C[] = new int[n];

        System.out.println("Enter numbers : ");

        for (int x = 0; x < n; x++) {
            A[x] = input.nextInt();
        }

        for (int x = 0; x < n; x++) {

            if (A[x] >= 0) {
                B[cB++] = A[x];
            } else {
                C[cC++] = A[x];
            }
        }

        System.out.println("positive numbers : ");

        for (int x = 0; x < cB; x++) {
            System.out.println("  " + B[x]);
        }

        System.out.println("negative numbers : ");

        for (int x = 0; x < cC; x++) {
            System.out.println("  " + C[x]);
        }
    }
}
