import java.util.Scanner;

public class P134 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] A = new int[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            A[i] = input.nextInt();
        }

        // Shift 3 positions to the left
        for (int j = 0; j < 3; j++) {

            int first = A[0];

            for (int i = 0; i < 9; i++) {
                A[i] = A[i + 1];
            }

            A[9] = first;
        }

        System.out.println("Array after left circular shift:");

        for (int i = 0; i < 10; i++) {
            System.out.print(A[i] + " ");
        }
    }
}