
import java.util.Scanner;

public class P078 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 1;
        while (x <= 1000) {

            int sum = 0;

            for (int y = 1; y < x; y++) {
                if (x % y == 0) {
                    sum += y;

                }
            }

            if (sum == x) {
                System.out.println(x);
            }
            x++;
        }

    }//end of main
}//end of class
