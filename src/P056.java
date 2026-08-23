
import java.util.Scanner;

public class P056 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();

        int temp = 0;

        while (n > 0) {
            if ((n % 10) % 2 == 0) {
                temp = temp * 10 + n % 10;
            }

            n /= 10;
        }

        System.out.println("even reverse  : " + temp);
    }//end of main
}//end of class
