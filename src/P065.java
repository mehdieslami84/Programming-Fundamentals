
import java.util.Scanner;

public class P065 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        for (int x = 1; x <= 100; x++) {
            System.out.print("Please Enter Number " + x + "  :  ");
            int n = input.nextInt();

            while (n > 0) {
                count++;
                n /= 10;
            }
        }

        System.out.println("Total number of digits: " + count);
    }//end of main
}//end of class
