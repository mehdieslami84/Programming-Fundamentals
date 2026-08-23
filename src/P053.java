
import java.util.Scanner;

public class P053 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();

        double count = 0;
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            if (digit % 2 != 0) {
                sum += digit;
                count++;
            }

            n /= 10;
        }

        System.out.println("avg of odd digits:  : " + sum / count);
    }//end of main
}//end of class
