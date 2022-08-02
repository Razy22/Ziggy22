package Day13_Whileloop;

import java.util.Scanner;

public class topic3_WhileloopExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("****Welcome to Calculator******");
        System.out.println("1- for addition : 2- for subs : 3-multi : 4- division :");
        int i = sc.nextInt();
        while (i == 1 || i == 2 || i == 3 || i == 4) {
           // System.out.println("Enter ur first num here:");
            System.out.println("Enter ur first num here:");
            double num1 = sc.nextDouble();
           // System.out.println("Enter ur first num here:"); write ur double before the sout
           // System.out.println("Enetr ur sec num here:");
            System.out.println("Enter ur second num here:");
            double num2 = sc.nextDouble();
            //System.out.println("Enter ur second num here:");
            if (i == 1) {
                double result = num1 + num2;
                System.out.println("The result is" + result);
            }
            else if  (i == 2) {
                double result = num1 - num2;
                System.out.println("The result is" + result);
            } else if (i == 3) {
                double result = num1 * num2;
                System.out.println("The result is" + result);
            } else if (i == 4) {
                double result = num1 / num2;
                System.out.println("The result is" + result);
            } else {
                break;
            }
            System.out.println("please select operation");
            System.out.println("1- for addition : 2- for subs : 3-multi : 4- division :");
            i = sc.nextInt();


        }

    }
}

