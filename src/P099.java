
import java.util.Scanner;

public class P099 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter N : ");
        double n = input.nextDouble();

        double m = 0;
        double s1 = 0;

        double d = n - (int) n;
        int n1 = (int) n;

        int d1 = (int) (d * 10000);

        double p1 = 0.0625;

        for (int x = 0; x < 4; x++) {

            int digit = d1 % 10;

            if (digit == 1) {
                m += p1;
            }

            d1 /= 10;
            p1 *= 2;
        }

        int p = 1;

        while (n1 > 0) {
            s1 += (n1 % 10) * p;
            p *= 2;
            n1 /= 10;
        }

        System.out.println(s1 + m);
    }
}
