
import java.util.Scanner;

public class P129 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Enter Number N : ");
        n = input.nextInt();

        int A[];
        A = new int[n];

        int cB = 0;
        int B[] = new int[n];

        for (int x = 0; x < n; x++) {
            System.out.print("Enter Number " + x + " : ");
            A[x] = input.nextInt();
        }

        int m;

        System.out.print("Enter Number M : ");
        m = input.nextInt();

        for (int x = 0; x < n; x++) {

            if (m == A[x]) {

                B[cB] = x;
                cB++;
            }
        }

        for (int x = 0; x < cB; x++) {
            System.out.print(B[x] + "  ");
        }
    }
}
