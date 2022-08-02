package IfElse;

import java.util.Scanner;

public class If_else_Scanner {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Welcome to Calculator");

        System.out.println("Enter your first number");
        double firstnum;
        firstnum= sc.nextDouble();


        System.out.println("Enter you second number");
        double secondnum;
        secondnum=sc.nextDouble();


        System.out.println("Enter 1 for addition:");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for division");
        System.out.println("Enter 4 for multiplication");
        System.out.println("Enter your choice:");
        double Choices;
        Choices= sc.nextDouble();

        if (Choices==1){
            System.out.println("Operation is addition"+ (firstnum+secondnum));
        } else if (Choices==2) {
            System.out.println("Operation is subtraction"+ (firstnum-secondnum));

        } else if (Choices==3) {
            System.out.println("Operation is division"+ (firstnum/secondnum));

        } else if(Choices==4){
            System.out.println("Operation is multiplication"+(firstnum*secondnum));
        } else{
            System.out.println("Invalid result");

        }


    }












}
