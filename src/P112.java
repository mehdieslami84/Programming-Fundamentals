
import java.util.Scanner;

public class P112 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        double s = 1;
        double p = 1;

        double x = 1;
        while (p > 0.0000001) {

            p *= (a / x);

            s += p;
            x++;
        }
        System.out.println(s);
    }
}
