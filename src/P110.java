
public class P110 {

    public static void main(String[] args) {

        double s = 0;
        double p = 1;
        int a = -1;
        for (int x = 2; x <= 100; x += 2) {

            p = p * (x) * (x - 1);
            s += a * (1.0 / p);
            a = a * (-1);

        }
        System.out.println(1 + s);
    }
}
