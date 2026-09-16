
import java.util.Scanner;

public class P114 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        double s = a;
        double p = a;

        double x = 3;

        while (Math.abs(p) > 0.0000001) {

            p *= -1 * (a * a / (x * (x - 1)));

            s += p;
            x += 2;
        }

        System.out.println(s);
    }
}
