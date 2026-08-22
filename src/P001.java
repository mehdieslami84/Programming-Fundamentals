// Write a program that takes a number from 1 to 365 and prints the current month.
import java.util.Scanner;

public class P001{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("pls enter Number : ");
        
        int n = input.nextInt(); //Enter n
        
        
        if (n <= 186){
        
            if(n%31==0){
                System.out.println("month is : " + n/31);
            }
              else
                System.out.println("month is : " + (n/31 + 1 ));
         }
        
        
         else if (n>186 && n<=336){
            int m =n-186;
            if (m%30==0)
            System.out.println("month is : "+ (m/30+6));
            else
            System.out.println("month is : " + ((m/30 + 7 )));
         }
         else if (n>336 && n <=366)
         System.out.println("12");
         else 
         System.out.println("no answer");
    }//end of main
}//end of class