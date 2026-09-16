
public class P107 {

    public static void main(String[] args) {

        double s = 0;

        for (int x = 1; x <= 20; x++) {
            s += (double) x / (21 - x);
        }

        System.out.println(s);
    }
}
