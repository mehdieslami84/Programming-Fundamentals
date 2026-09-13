
import java.util.Scanner;

public class P092 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("for X^3-3X+1 ");
        double mid = 0;

        System.out.println("Enter x1 : ");
        double x1 = input.nextDouble();

        System.out.println("Enter x2 : ");
        double x2 = input.nextDouble();

        double f1 = x1 * x1 * x1 - (3 * x1) + 1;
        double f2 = x2 * x2 * x2 - (3 * x2) + 1;

        if (f1 * f2 >= 0) {

            System.out.println("Invalid interval");

        } else {

            while (x2 - x1 > 0.000001) {
                mid = (x2 + x1) / 2;
                double fmid = mid * mid * mid - (3 * mid) + 1;
                if (fmid * f2 > 0) {
                    x2 = mid;
                    f2 = fmid;
                } else {
                    x1 = mid;
                    f1 = fmid;
                }

            }
            System.out.println("x = " + mid);
        }
    }
}
