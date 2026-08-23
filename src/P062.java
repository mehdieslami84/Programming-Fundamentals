
import java.util.Scanner;

public class P062 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number : ");
        int n = input.nextInt();

        long a = 1;
        long b = 1;
        long r = a + b;

        while (r < n) {
            a = b;
            b = r;
            r = a + b;
        }
        if (n == r) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }//end of main
}//end of class
