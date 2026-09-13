
import java.util.Scanner;

public class P093 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("For X^3 - 3X + 1");

        double x1 = -10000;
        double x2 = -9999;

        while (x2 <= 10000) {

            double f1 = x1 * x1 * x1 - 3 * x1 + 1;
            double f2 = x2 * x2 * x2 - 3 * x2 + 1;

            if (f1 * f2 < 0) {

                double a = x1;
                double b = x2;
                double mid = 0;

                while (b - a > 0.000001) {

                    mid = (a + b) / 2;

                    double fa = a * a * a - 3 * a + 1;
                    double fm = mid * mid * mid - 3 * mid + 1;

                    if (fa * fm < 0) {
                        b = mid;
                    } else {
                        a = mid;
                    }
                }

                mid = (a + b) / 2;

                System.out.println("Root = " + mid);
            }

            x1++;
            x2++;
        }
    }
}
