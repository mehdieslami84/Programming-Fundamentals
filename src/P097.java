
import java.util.Scanner;

public class P097 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter n:");
        double n = input.nextDouble();
        int m = (int) n;

        n = n - m;
        int p = 1;
        int s = 0;
        while (m > 0) {
            s = s + (m % 2) * p;
            p *= 10;
            m /= 2;

        }
        int a = 0;
        int q = 10000;
        for (int x = 1; x <= 5; x++) {

            n *= 2;
            if (n > +1) {
                a = a + q;
                n = n - 1;

            }
            q /= 10;
        }
        System.out.println(s + "." + a);
    }
}
