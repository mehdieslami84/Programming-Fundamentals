package P073;

import java.util.Scanner;

public class P073_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("pls enter Number : ");
        int n = input.nextInt(); //Enter n

        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }//end of main
}//end of class
