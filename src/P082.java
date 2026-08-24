
import java.util.Scanner;

public class P082 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();

        int b = 0;
        int p = 1;

        while (n > 0) {

            b = b + (n % 2) * p;
            p = p * 10;
            n /= 2;
        }
        System.out.println("Binary : " + b);
    }
}
