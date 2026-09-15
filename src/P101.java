
public class P101 {

    public static void main(String[] args) {

        for (int x = 100; x <= 999; x++) {

            int n = x;

            int sum = 0;
            int d;

            while (n > 0) {

                d = n % 10;

                sum = sum + d * d * d;

                n = n / 10;
            }

            if (sum == x) {
                System.out.println(x);
            }
        }
    }
}
