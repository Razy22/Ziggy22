package src.day_11_Forloops;

import java.util.Scanner;

public class Topic7_foorloopp3 {
    public static void main(String[] args) {
        //Write a code where user is asked to enter a number.
        //Find the sum of all the even numbers between 0 to that number (included)
        //Find the sum of all the odd numbers between 0 to that number (included)

        //forloop to display odd numbers from 0-10
        for (int i = 0; i <= 10; i++) {
            //create an if statement using modulo operator
            if (i % 2 == 1) {
                System.out.println(i);

            }
        }
        System.out.println("******************************");
        for (int i=0; i<10; i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }

    }
}
