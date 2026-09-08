import java.util.Scanner;

public class P134 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] A = new int[10];
        int temp = 0;

        System.out.println("Enter 10 numbers:");

        for (int x = 0; x < 10; x++) {
            A[x] = input.nextInt();
        }

        for (int x = 0; x < 3; x++) {

            temp = A[0];

            for (int y = 1; y < 10; y++) {
                A[y - 1] = A[y];
            }

            A[9] = temp;
        }

        System.out.println("Array is : ");

        for (int x = 0; x < 10; x++) {
            System.out.print(A[x] + " ");
        }
    }
}