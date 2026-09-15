
import java.util.Scanner;

public class P099 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter N : ");
        double n = input.nextDouble();

        double s = 0;
        double m = 0;
        double s1 = 0;
        double p1 = 0.03125;
        double p2 = 0.0001;

        double d = n - (int) n;
        int n1 = (int) n;

        for (int x = 0; x <= 4; x++) {
            s = d % p2;
            if (s == 1) {
                m += p1;
                p1 *= 2;
            } else {
                p1 *= 2;
            }
        }

        int p = 1;

        while (n1 > 0) {
            s1 += (n1 % 10) * p;
            p *= 2;
            n1 /= 10;
        }

        System.out.println(s1 + "." + m);
    }
}
