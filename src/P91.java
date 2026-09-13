
public class P91 {

    public static void main(String[] args) {

        double s = 0;

        double sum = 1;
        for (double a = 1; a < 5; a += 0.001) {

            double p = 1;

            int A = -1;
            int x = 3;

            while (p > 0.00001) {

                p = p * a * a / (x * (x - 1));

                sum = sum + A * p;

                A = -A;
                x += 2;
            }

            s = s + sum * 0.001;
        }

        System.out.println(s);
        System.out.println(sum);
    }
}
