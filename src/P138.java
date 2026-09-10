
import java.util.Scanner;

public class P138 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int A[] = new int[n];
        int B[] = new int[n];
        int C[] = new int[n];

        int cB = 0;
        int cC = 0;

        System.out.println("Enter Array:");

        for (int x = 0; x < n; x++) {
            System.out.print("Enter [" + x + "] : ");
            A[x] = input.nextInt();
        }

        for (int x = 0; x < n; x++) {
            int c = 0;

            for (int y = 1; y <= A[x]; y++) {
                if (A[x] % y == 0) {
                    c++;
                }
            }

            if (c == 2) {
                B[cB++] = A[x];
            } else {
                C[cC++] = A[x];
            }
        }

        System.out.println("Prime");
        for (int x = 0; x < cB; x++) {
            System.out.println(B[x]);
        }

        System.out.println("not Prime");
        for (int x = 0; x < cC; x++) {
            System.out.println(C[x]);
        }
    }
}
