
import java.util.Scanner;

public class P098 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter n:");
        double n = input.nextDouble();

        int m = (int) n;

        n = n - m;

        int p = 1;
        int s = 0;

        while (m > 0) {
            s = s + (m % 8) * p;
            p *= 10;
            m /= 8;
        }

        int a = 0;
        int q = 10000000;

        for (int x = 1; x <= 8; x++) {

            n *= 8;

            if (n >= 1) {
                a = a + (int) n * q;
                n = n - (int) n;
            }

            q /= 10;
        }

        System.out.println(s + "." + a);
    }
}
