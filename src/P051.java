
import java.util.Scanner;

public class P051 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();

        double count = 0;
        int sum = 0;

        while (n > 0) {

            sum += n % 10;
            count++;

            n /= 10;
        }

        System.out.println("avg of digits:  : " + sum / count);
    }//end of main
}//end of class
