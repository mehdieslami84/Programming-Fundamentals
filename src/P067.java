
import java.util.Scanner;

public class P067 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int c = 0;
        for (int x = 1; x <= 100; x++) {
            System.out.print("Please Enter Number " + x + "  :  ");
            int n = input.nextInt();

            int m = n;
            int reverse = 0;

            while (n > 0) {
                reverse = reverse * 10 + n % 10;
                n /= 10;
            }

            if (m == reverse) {
                c++;
            }
        }
        System.out.println(c);
    }//end of main
}//end of class
