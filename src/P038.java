
import java.util.Scanner;

// Write a program that prints the even of divisors of a given number.
public class P038 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        for (int x = 1; x <= 100; x++) {
            System.out.print("Enter Number " + x + " : ");
            int n = input.nextInt();
            if (n % 2 != 0) {
                count++;
            }

        }
        System.out.println("odd numbers : " + count);

    }//end of main
}//end of class
