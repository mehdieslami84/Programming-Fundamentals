
import java.util.Scanner;

public class P063 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int c = 0;
        for (int x = 1; x <= 8; x++) {

            System.out.print("Please Enter Number " + x + "  :  ");
            int n = input.nextInt();

            long a = 1;
            long b = 1;
            long r = a + b;

            while (r < n) {
                a = b;
                b = r;
                r = a + b;
            }
            if (n == r) {
                c++;
            }

        }
        System.out.println(c);
    }//end of main
}//end of class
