package IfElse;
import java.util.Scanner;
public class Java_Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("JAVA CALCULATOR");

        System.out.println("Enter 1st number");
        double num1;
        num1= sc.nextDouble();

        System.out.println("Enter 2nd number");
        double num2;
        num2= sc.nextDouble();

        System.out.println("Press 1 for Addition");
        System.out.println("press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Enter your Choice");

        double Choice;
        Choice= sc.nextDouble();
        if (Choice==1){

            System.out.println("Addition:"+(num1+num2));
        } else if (Choice == 2) {

            System.out.println("Subtraction:"+(num1-num2));
        } else if (Choice==3) {

            System.out.println("Multiplication"+(num1*num2));

        } else if (Choice==4) {
            System.out.println("Division"+(num1/num2));

        }else{
            System.out.println("Invalid Input");
        }



    }

    }

