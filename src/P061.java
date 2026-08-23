
public class P061 {

    public static void main(String[] args) {

        int c = 1;
        int c2 = 0;
        long a = 1;
        long b = 1;
        long r = a + b;

        while (c != 50) {

            c2 = 0;

            for (int x = 1; x <= r; x++) {
                if (r % x == 0) {
                    c2++;
                }
            }

            if (c2 == 2) {
                System.out.println(c + " : " + r);
                c++;
            }

            a = b;
            b = r;
            r = a + b;
        }
    }//end of main
}//end of class
