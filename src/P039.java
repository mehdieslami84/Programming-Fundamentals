
import java.util.Scanner;

// Write a program that prints the even of divisors of a given number.
public class P039 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0, s = 0, i = 0;

        for (int x = 1; x <= 100; x++) {
            int count = 0;
            System.out.print("Enter Number " + x + " : ");
            int n = input.nextInt();
            System.out.print(n + " = " + "{ ");
            for (int y = 1; y <= n; y++) {
                if (n % y == 0) {
                    System.out.print(y + ",");
                    count++;
                }
                if (count > max) {
                    max = count;
                    s = n;
                    i = x;
                }
            }
            System.out.println("}" + "\n" + "count is : " + count);

        }
        System.out.println("Number " + i + " =  " + s + "\n" + "has most divisor with :  " + max);

    }//end of main
}//end of class
