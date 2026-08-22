
import java.util.Scanner;

// Write a program that prints the even of divisors of a given number.
public class P036 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int c = 0;

        for (int x = 1; x <= 100; x++) {
            System.out.print("Enter Number " + x + " : ");
            int n = input.nextInt();
            count = 0;
            for (int y = 1; y <= n; y++) {
                if (n % y == 0) {
                    count++;

                }
            }
            if (count == 2) {
                c++;
            }
        }
        System.out.println("Prime numbers : " + c);

    }//end of main
}//end of class
