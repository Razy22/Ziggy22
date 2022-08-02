package src.day_11_Forloops;

import java.util.Scanner;

public class Topic8_homework3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num=sc.nextInt();
        System.out.println("Enter numbers between 0 to..:"+num);
        int num1=0;
        int num2=0;
        for (int i=0; i<=num; i++){
            if(i % 2==1){
                System.out.println(+i+"Odd Number");
                num1 +=i;
            } else {
                num2 +=i;
                System.out.println(+i+"Even Number");


            }
        }
        System.out.println("Odd numbers:"+num1);
        System.out.println("Even numbers:"+num2);

    }
}
