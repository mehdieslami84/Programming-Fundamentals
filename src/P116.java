
public class P116 {

    public static void main(String[] args) {

        double s = 0;

        for (int x = 1; x < 100; x++) {

            double p = 1;

            for (int y = 1; y <= x; y++) {
                p = p * y / x;
            }

            s = s + p;
        }

        System.out.println(s);
    }
}
