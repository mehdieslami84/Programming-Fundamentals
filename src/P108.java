
public class P108 {

    public static void main(String[] args) {

        double s = 0;
        double p = 1;
        int a = 1;
        for (int x = 1; x <= 100; x++) {

            p = p * (x);
            s += a * (1.0 / p);
            a = a * (-1);

        }
        System.out.println(s);
    }
}
