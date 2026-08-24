
import java.util.Scanner;

public class P075 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");

        for (int x = 1; x <= 7; x++) {
            System.out.println();
            for (int y = 1; y <= 7; y++) {

                long n = x * y;
                long s = 0;
                long p = 1;
                while (n > 0) {
                    s = s + p * (n % 8);
                    p = p * 10;
                    n = n / 8;
                }

                if (s >= 10 && s <= 99) {
                    System.out.print(s + " "); 
                }else {
                    System.out.print(s + "  ");
                }

            }
        }

    }// end of main
}// end of class
