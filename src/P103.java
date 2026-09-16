
public class P103 {

    public static void main(String[] args) {

        int s = 0;
        int a = 1;
        for (int x = 1; x <= 100; x++) {
            s += (x * a);
            a = a * (-1);
        }
        System.out.println(s);
    }
}
