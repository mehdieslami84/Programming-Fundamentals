
import java.util.Scanner;

public class P077 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int flag = 1;
        while (flag == 1) {
            int sum = 0;
            for (int y = 1; y < x; y++) {
                if (x % y == 0) {
                    sum += y;

                }
            }

            if (sum == x) {
                System.out.println("yes");
                flag = 0;
            } else {
                System.out.println("no");
                flag = 0;
            }
        }

    }//end of main
}//end of class
