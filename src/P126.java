
import java.util.Scanner;

// Write a program that takes 5 numbers and prints them from last to first.
public class P126 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A[] = new int[20];
        int sum = 0;
        int c = 0;

        for (int x = 0; x < 20; x++) {
            System.out.print("Enter Number " + (x + 1) + " : ");
            A[x] = input.nextInt();
            sum += A[x];

        }
        double avg = sum / 20;
        System.out.println("avg is : " + avg);
        for (int x = 0; x < 20; x++) {
            if (A[x] > avg) {
                int a = 1;
                int b = 1;
                int r = a + b;
                while (r < A[x]) {
                    a = b;
                    b = r;
                    r = a + b;
                }
                if (r == A[x]) {

                    c++;
                }
            }
        }
        System.out.print("count of more than avg and in fibonachi :  " + c);

    }
}
