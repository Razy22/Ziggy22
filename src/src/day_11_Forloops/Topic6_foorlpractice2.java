package src.day_11_Forloops;

import java.util.Scanner;

public class Topic6_foorlpractice2 {
    public static void main(String[] args) {
//Write a code where user is asked to enter a number and check for
//every number between 0 to that number to see how many number
// between 0 to that number can be divided to 3 and 5 and sum all
// those number, Print the result.


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int numin = sc.nextInt();
        int count = 0;
        int sum= 0;
        for (int i = 0; i <= numin; i++) {
            if (i % 3 == 0 &&  i % 5 == 0) {
                sum=sum+i;

            }


        }
        System.out.println("The count of the number between 0+ :"+numin+count);
        System.out.println("Sum of numbers divided by 3 and 5:"+sum);
    }
}
