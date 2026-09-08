
import java.util.Scanner;

public class P135 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = input.nextInt();

        int[] A = new int[n];

        System.out.println("Enter " + n + " numbers:");

        for (int x = 0; x < n; x++) {
            A[x] = input.nextInt();
        }

        System.out.print("Enter m : ");
        int m = input.nextInt();

        m = m % n;

        for (int x = 0; x < m; x++) {

            int temp = A[n - 1];

            for (int y = n - 1; y > 0; y--) {
                A[y] = A[y - 1];
            }

            A[0] = temp;
        }

        System.out.println("Array is : ");

        for (int x = 0; x < n; x++) {
            System.out.print(A[x] + " ");
        }
    }
}
