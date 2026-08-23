
import java.util.Scanner;

public class P069 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();
        int counter = 0;

        for (int x = 1; x <= n; x++) {
            int c = 0;

            if (n % x == 0) {

                for (int y = 1; y <= x; y++) {
                    if (x % y == 0) {
                        c++;
                    }
                }

                if (c == 2) {
                    System.out.println(x + " ");
                    counter++;
                }
            }
        }
        System.out.println("number of Prime number is  " + counter);
    }//end of main
}//end of class
