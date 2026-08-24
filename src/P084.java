
import java.util.Scanner;

public class P084 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();
        int p = 1;
        int d = 0;
        while (n > 0) {
            d = p * (n % 10) + d;
            p = p * 2;
            n /= 10;
        }
        System.out.println("Decimal is  : " + d);
    }
}
