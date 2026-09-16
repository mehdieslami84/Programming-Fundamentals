
import java.util.Scanner;

public class P113 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        double s = 1;
        double p = 1;

        double x = 2;
        while (p > 0.0000001) {

            p *= (a * a / (x * (x - 1)));

            s += p;
            x += 2;
        }
        System.out.println(s);
    }
}
