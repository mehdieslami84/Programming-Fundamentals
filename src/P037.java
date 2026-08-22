
import java.util.Scanner;

// Write a program that prints the even of divisors of a given number.
public class P037 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int sum = 0;

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
                sum += n;
            }
        }
        System.out.println("Prime numbers : " + sum);

    }//end of main
}//end of class
