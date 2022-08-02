package Week2;

import java.util.Scanner;

public class Interview_question4 {
    public static void main(String[] args) {
        /*
        Write a program to display the multiplication table from 1 to 10. Please use nested for loop:
        - create a scanner
        - create ur int n= sc.nextInt
         - create your fl and i=1 ; i<= 10; i++
         then print value of i
         - then for your 2nd loop is the same thing but
         when you print you have to put that i + times )+ i your number we are basically telling
        java that we are creating a time table***********



         */

        Scanner sc = new Scanner(System.in);
        System.out.println("===== Please Enter A Number =====");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            for (int j = 1; j <= 1; j++) {
                System.out.println(j+" X  " +number+ " = " +j*number);



            }
        }


    }
}
