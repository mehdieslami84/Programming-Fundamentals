// Write a program that prints the even of divisors of a given number.

public class P040 {

    public static void main(String[] args) {
        int c = 0;
        int i = 1;
        while (c < 50) {
            int x = 0;
            for (int y = 1; y <= i; y++) {
                if (i % y == 0) {
                    x++;
                }
            }
            if (x == 2) {
                c++;
                System.out.println(c + "   prime : " + i);
            }
            i++;
        }
    }//end of main
}//end of class
