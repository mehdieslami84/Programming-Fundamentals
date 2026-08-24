package P073;

import java.util.Scanner;

public class P073_6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("pls enter Number : ");

        int n = input.nextInt();

        for (int x = 1; x <= n; x++) {

            for (int y = 1; y <= n - x; y++) {
                System.out.print(" ");
            }

            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int x = n - 1; x >= 1; x--) {

            for (int y = 1; y <= n - x; y++) {
                System.out.print(" ");
            }

            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
