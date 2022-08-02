package src.day_11_Forloops;

import java.util.Scanner;

public class Topic10_homework5 {
    public static void main(String[] args) {
        //Write a code where user is asked to enter a number:
        //Calculate the square number from 0 to given number
        // and print the result for each number, (square of a number is number*number == > 5*5 = 25 or 6*6 = 36
        Scanner sc= new Scanner(System.in);
        int input=sc.nextInt();
        System.out.println("Enter a value:");
        for (int i=0; i<=input; i++){
            System.out.println(i+"*"+i+"="+i*i);
        }
    }

}
