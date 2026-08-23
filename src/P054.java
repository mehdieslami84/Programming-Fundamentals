
import java.util.Scanner;

public class P054 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number : ");
        int n = input.nextInt();

        int temp = 0;

        while (n > 0) {

            temp *= 10 + n % 10;

            n /= 10;
        }

        System.out.println("reverse  : " + temp);
    }//end of main
}//end of class
