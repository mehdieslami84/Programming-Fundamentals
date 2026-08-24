
import java.util.Scanner;

public class P083 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();

        int b = 0;
        int p = 1;

        while (n > 0) {

            b = b + (n % 8) * p;
            p = p * 10;
            n /= 8;
        }

        System.out.println("Octal : " + b);
    }
}
