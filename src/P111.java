
public class P111 {

    public static void main(String[] args) {

        double s = 0;
        double p = 1;
        int x = 1;
        while (p > 0.0000001) {

            p *= 1.0 / x;
            s += p;
            x++;
        }
        System.out.println(s);
    }
}
