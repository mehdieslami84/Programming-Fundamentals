
import java.util.Scanner;

public class P100 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        double number = input.nextDouble();

        int integerPart = (int) number;
        double fractionalPart = number - integerPart;

        // Convert integer part
        String hex = "";

        if (integerPart == 0) {
            hex = "0";
        }

        while (integerPart > 0) {

            int remainder = integerPart % 16;

            if (remainder < 10) {
                hex = remainder + hex;
            } else {
                hex = (char) ('A' + remainder - 10) + hex;
            }

            integerPart /= 16;
        }

        // Convert fractional part
        if (fractionalPart > 0) {

            hex += ".";

            for (int i = 0; i < 8 && fractionalPart > 0; i++) {

                fractionalPart *= 16;

                int digit = (int) fractionalPart;

                if (digit < 10) {
                    hex += digit;
                } else {
                    hex += (char) ('A' + digit - 10);
                }

                fractionalPart -= digit;
            }
        }

        System.out.println("Hexadecimal: " + hex);
    }
}
