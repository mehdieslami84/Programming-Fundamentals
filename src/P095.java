
import java.util.Scanner;

public class P095 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = input.nextInt();

        for (int k = 0; k <= n; k++) {

            int q1 = 1;
            for (int x = 1; x <= n; x++) {
                q1 *= x;
            }

            int q2 = 1;
            for (int x = 1; x <= k; x++) {
                q2 *= x;
            }

            int q3 = 1;
            for (int x = 1; x <= n - k; x++) {
                q3 *= x;
            }

            int r = q1 / (q2 * q3);

            System.out.print(r + " ");
        }
    }
}
