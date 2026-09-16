
public class P106 {

    public static void main(String[] args) {

        double s = 0;
        double p = 1;
        for (int x = 1; x <= 100; x++) {

            p = p * (x);
            s += 1.0 / p;

        }
        System.out.println(s);
    }
}
