
import java.util.Scanner;

public class P132 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = input.nextInt();

        int A[] = new int[n];

        System.out.print("Enter Array : ");
        for (int x = 0; x < n; x++) {
            A[x] = input.nextInt();
            System.out.print("  ");
        }

        System.out.print("Enter M : ");
        int m = input.nextInt();

        int size = n;

        for (int x = 0; x < size; x++) {

            if (A[x] == m) {

                for (int y = x; y < size - 1; y++) {
                    A[y] = A[y + 1];
                }

                size--;
                x--;
            }
        }

        System.out.println("after delete");
        for (int x = 0; x < size; x++) {
            System.out.print(A[x] + "  ");
        }

    }//end of main
}//end of class
