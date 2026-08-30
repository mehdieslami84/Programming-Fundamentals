
import java.util.Scanner;

public class P132 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = input.nextInt();

        int A[] = new int[n];

        System.out.println("Enter Array : ");
        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }

        System.out.print("Enter m : ");
        int m = input.nextInt();

        int size = n;

        for (int i = 0; i < size; i++) {

            if (A[i] == m) {

                for (int j = i; j < size - 1; j++) {
                    A[j] = A[j + 1];
                }

                size--;
                i--;
            }
        }

        System.out.println("Array after deleting " + m + " :");

        for (int i = 0; i < size; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
