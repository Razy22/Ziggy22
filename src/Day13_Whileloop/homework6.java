package Day13_Whileloop;

import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {
        /*
        Write a code where it ask user to enter an integer number
        Reverse the given number and print the result
        Example input ( 5678 )
        Example output ( 8765 )
        Step by step
         */

        int num=0; // entered num
        int reversed_num= 0; // the result
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your number:");
        num= sc.nextInt();

        while (num!=0){  // ur number iis not equal to 0
            int rem=0; // reminder of your equation
            rem= num % 10; // mode of ur num is ur reminder
            reversed_num = reversed_num*10+rem; // reversed num again *10=rem
            num=num/10; // reminder of num
        }
        System.out.println("Entered number"+ num); // print out ur num
        System.out.println("Reversed number"+reversed_num); // print out the reversed
    }

}
