// Write a program that prints the even of divisors of a given number.

public class P031 {

    public static void main(String[] args) {

        int count = 0;

        for (int x = 1; x <= 1000; x++) {
            count = 0;
            for (int y = 1; y <= x; y++) {
                if (x % y == 0) {
                    count++;

                }
            }
            if (count == 2) {
                System.out.println(x);
            }
        }

    }//end of main
}//end of class
