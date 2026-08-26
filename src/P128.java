
import java.util.Scanner;

public class P128 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int c = 0;
        System.out.print("Enter Number N : ");
        n = input.nextInt();
        int A[];
        A = new int[n];
        for (int x = 0; x < n; x++) {
            System.out.print("Enter Number " + (x) + " : ");
            A[x] = input.nextInt();
        }
        int m;
        System.out.print("Enter Number M : ");
        m = input.nextInt();
        for (int x = n - 1; x >= 0; x--) {
            if (m == A[x]) {
                c++;
            }

        }
        System.out.print(c);

    }
}
