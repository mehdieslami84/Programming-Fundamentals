
public class P109 {

    public static void main(String[] args) {

        double s = 1;
        double p = 1;

        for (int x = 3; x <= 99; x += 2) {

            p = p * (x - 1) * x;
            s += 1.0 / p;

        }

        System.out.println(s);
    }
}
