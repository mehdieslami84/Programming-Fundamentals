
import java.util.Scanner;

public class P131 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Array : ");
        int A[] = new int[20];
        for (int x = 0; x < 20; x++) {

            int n = 0;
            A[x] = input.nextInt();

        }
        for (int x = 5; x < 20; x++) {

            A[x - 1] = A[x];

        }

        for (int x = 0; x < 19; x++) {
            System.out.print(A[x]);
        }
    }
}
