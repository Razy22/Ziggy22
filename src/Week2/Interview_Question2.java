package Week2;

import java.util.Scanner;

public class Interview_Question2 {
    public static void main(String[] args) {
        /*
       -write a program that will check if the given number is a  prime number or not
       - 13=> prime , 17 prime
       - 22 is not prime
       - scanner/ for / if / int
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number here:");
        int num = sc.nextInt();


        for (int i = 2; i < num; i++) {
            if (num % i == 0){

                System.out.println("Your number is not a prime number" + num);

            }else {
                System.out.println("Your number is a prime number"+num);

            }
            break;

        }


    }
}
