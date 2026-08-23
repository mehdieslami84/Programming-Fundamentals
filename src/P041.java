
public class P041 {

    public static void main(String[] args) {

        long a = 0;
        long b = 1;
        long c = a + b;
        for (long x = 2; x <= 50; x++) {
            System.out.println(c + "\t");
            a = b;
            b = c;
            c = a + b;

        }
    }//end of main
}//end of class
