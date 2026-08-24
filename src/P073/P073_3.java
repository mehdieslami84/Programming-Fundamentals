package P073;

import java.util.Scanner;

public class P073_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("pls enter Number : ");

        int n = input.nextInt();

        for (int x = 1; x <= n; x++) {

            for (int y = 1; y <= n - x; y++) {
                System.out.print(" ");
            }

            for (int z = 1; z <= 2 * x - 1; z++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }//end of main

}//end of class 
