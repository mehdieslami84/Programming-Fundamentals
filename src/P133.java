
import java.util.Scanner;

public class P133 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = input.nextInt();

        int A[] = new int[n];

        System.out.println("Enter Array : ");
        for (int x = 0; x < n; x++) {
            A[x] = input.nextInt();
        }

        System.out.print("Enter p1 : ");
        int p1 = input.nextInt();

        System.out.print("Enter p2 : ");
        int p2 = input.nextInt();

        int size = n;

        for (int x = 0; x < size; x++) {

            if (A[x] > p1 && A[x] < p2) {

                for (int y = x; y < size - 1; y++) {
                    A[y] = A[y + 1];
                }

                size--;
                x--;
            }
        }

        System.out.println("Array after deletion : ");

        for (int x = 0; x < size; x++) {
            System.out.print(A[x] + "  ");
        }

        input.close();

    }//end of main
}//end of class
