
import java.util.Scanner;

public class P139 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N : ");
        int n = input.nextInt();

        int A[] = new int[n];
        int B[] = new int[n];
        int C[] = new int[n];
        int D[] = new int[n];

        int cB = 0;
        int cC = 0;
        int cD = 0;

        for (int x = 0; x < n; x++) {
            System.out.print("Enter [" + x + "] : ");
            A[x] = input.nextInt();
        }

        for (int x = 0; x < n; x++) {

            int e = 0;
            int f = 1;
            int r = e + f;

            while (r < A[x]) {
                e = f;
                f = r;
                r = e + f;
            }

            if (r == A[x]) {
                D[cD++] = A[x];
            }

            int c = 0;

            for (int y = 1; y < A[x]; y++) {
                if (A[x] % y == 0) {
                    c++;
                }
            }

            if (c == 1) {
                B[cB++] = A[x];
            } else {
                C[cC++] = A[x];
            }
        }

        System.out.println("\nB (Prime Numbers):");
        for (int x = 0; x < cB; x++) {
            System.out.print(B[x] + " ");
        }

        System.out.println("\n\nC (Non-Prime Numbers):");
        for (int x = 0; x < cC; x++) {
            System.out.print(C[x] + " ");
        }

        System.out.println("\n\nD (Fibonacci Numbers):");
        for (int x = 0; x < cD; x++) {
            System.out.print(D[x] + " ");
        }

        input.close();
    }
}
