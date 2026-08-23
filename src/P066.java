
import java.util.Scanner;

public class P066 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double avg = 0;
        double count = 0;
        int sum = 0;
        double sum2 = 0;
        for (int x = 1; x <= 100; x++) {
            System.out.print("Please Enter Number " + x + "  :  ");
            int n = input.nextInt();

            while (n > 0) {

                sum += n % 10;
                count++;

                n /= 10;
            }
            avg = sum / count;
            sum2 += avg;

        }

        System.out.println("avg of avg:  : " + sum2 / count);
    }//end of main
}//end of class
