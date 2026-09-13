
import java.util.Scanner;

public class P094 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Combination : ");

        System.out.println("Enter m ");
        int m = input.nextInt();

        System.out.println("Enter n : ");
        int n = input.nextInt();

        int q1 = 1;
        for (int x = 1; x <= m; x++) {
            q1 *= x;

        }
        int q2 = 1;
        for (int x = 1; x <= n; x++) {
            q2 *= x;

        }
        int q3 = 1;
        for (int x = 1; x <= (m - n); x++) {
            q3 *= x;
        }

        int r = q1 / (q2 * q3);

        System.out.println(r);

    }
}
