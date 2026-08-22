// Write a program that takes n, the requested amount of money from an ATM, and then breaks n into 1, 5, 10, and 50 toman bills.
import java.util.Scanner;

public class P003 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);


        System.out.print("pls enter Number : ");
        
        int n = input.nextInt(); //Enter n
        
        System.out.println(n/50 +"ta  50 toman + " + (n%50)/10 + "ta  10 toman + " + ((n%50)%10)/5 +"ta  5 toman + " + (((n%50)%10)%5)/1 + "ta  1 toman + ");
        
    }//end of main
}//end of class
