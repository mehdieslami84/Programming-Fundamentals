
import java.util.Scanner;

public class P090 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("for 1/x ");

        System.out.println("Enter number 1 : ");
        long n1 = input.nextInt();

        System.out.println("Enter number 2 : ");
        long n2 = input.nextInt();

        double s = 0.0;
        double dt = 0.0000001;
        for (double x = n1; x <= n2; x += dt) {
            s += dt * 1 / x;

        }
        System.out.println(s);
    }//end of main
}//end of class
