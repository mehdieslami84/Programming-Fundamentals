
public class P117 {

    public static void main(String[] args) {

        double s = 0;

        int A = 1;

        for (int x = 1; x < 100; x += 2) {

            double p = 1;

            for (int y = 1; y <= x; y++) {
                p = p * y / x;
            }

            s = s + A * p;

            A = -A;
        }

        System.out.println(s);
    }
}
