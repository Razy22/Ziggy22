package src.day_11_Forloops;

import java.util.Scanner;

public class Topic5_foolrlooppractice1 {
    public static void main(String[] args) {
       // Write a code where user is asked to enter an integer number:
       // 1) Using the given number find the factorial of that number and Print the result.
       // example: 5 ==> 5! = 5*4*3*2*1 = 120
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your integer here:");

        int factorial =1;
        int num= sc.nextInt();
        for (int i = 1; i<=num;i++){
         factorial *=i;

        }
        System.out.println("Result: "+num+"!="+factorial);


    }
}
