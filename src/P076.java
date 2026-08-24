
import java.util.Scanner;

public class P076 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int c = 0;
        for (int x = 1; x <= 5; x++) {
            int a = 1;
            int b = 1;
            int r = 2;
            System.out.print("Enter number " + x + " : ");
            int n = input.nextInt();
            int c2 = 0;
            for (int y = 1; y <= n; y++) {
                if (n % y == 0) {
                    c2++;
                }
                if (c2 == 2) {
                    while (n > r) {
                        a = b;
                        b = r;
                        r = a + b;
                    }
                    if (n == r) {
                        c++;
                    }
                }
            }

        }
        System.out.println("All count is: " + c);
    }// end of main
}// end of class
