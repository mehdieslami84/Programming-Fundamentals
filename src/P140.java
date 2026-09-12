
import java.util.Scanner;

public class P140 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = input.nextInt();

        int A[] = new int[n];
        int B[] = new int[n];

        int cB = 0;

        int c = 0;
        for (int x = 0; x < n; x++) {
            System.out.print("Enter [" + x + "] : ");
            A[x] = input.nextInt();

        }
        for (int x = 0; x < n - c; x++) {
            if (A[x] % 2 == 0) {
                for (int y = x; y < n - 1; y++) {
                    A[y] = A[y + 1];

                }
                x--;
                c++;
            }
        }

        for (int x = 0; x < n - c; x++) {
            System.out.print(A[x] + "  ");
        }
    }
}
