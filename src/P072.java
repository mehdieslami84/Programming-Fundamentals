
public class P072 {

    public static void main(String[] args) {

        int flag = 0;

        long a = 1;
        long b = 1;
        long r = a + b;

        while (flag != 1) {

            long temp = 0;
            long n = r;

            while (n > 0) {
                temp = temp * 10 + n % 10;
                n /= 10;
                System.out.println(r);
            }

            if (r == temp) {
                flag = 1;
            }

            a = b;
            b = r;
            r = a + b;
        }

    }//end of main
}//end of class
