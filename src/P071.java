
import java.util.Scanner;

public class P071 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();

        double c2 = 0;
        double sum = 0;
        for (int x = 1; x <= n; x++) {
            if (n % x == 0) {

                int c = 0;
                for (int y = 1; y <= x; y++) {
                    if (x % y == 0) {
                        c++;
                    }
                }
                if (c == 2) {
                    sum += x;
                    c2++;
                }

            }
        }
        System.out.println(sum / c2);

    }//end of main
}//end of class
