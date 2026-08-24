
import java.util.Scanner;

public class P081 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();

        int reverse = 0;

        while (n > 0) {
            if (n % 10 != 0) {
                reverse = reverse * 10 + n % 10;
            }
            n /= 10;
        }
        System.out.println("reverse without zero : " + reverse);
    }
}
