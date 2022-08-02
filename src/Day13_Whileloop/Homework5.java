package Day13_Whileloop;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to Grade Calculator for each student");

            String firstname = " ";
            //firstname= sc.nextLine();
            System.out.println("Please Enter Students First Name:" + firstname);
            firstname = sc.nextLine();

            String lastname = " ";
            System.out.println("Please Enter Students Last Name" + lastname);
            lastname = sc.nextLine();

            System.out.println("Please Enter Students Grades Here:");

            int score = 0;
            score = sc.nextInt();
            String grades = " ";
            grades = sc.nextLine();

            if (score >= 90 && score <= 100) {
                grades = "A";
                System.out.println(firstname + " " + lastname + " " + score + " Your Grade:" + grades);

            } else if (score >= 80 && score < 90) {
                grades = "B";
                System.out.println(firstname + " " + lastname + " " + score + " Your Grade:" + grades);


            } else if (score >= 70 && score < 80) {
                grades = "C";
                System.out.println(firstname + " " + lastname + " " + score + " Your Grade:" + grades);
            }

            if (score >= 60 && score < 70) {
                grades = "D";
                System.out.println(firstname + " " + lastname + " " + score + " Your Grade:" + grades);
            } else if (score >= 50 && score< 60){
                grades = "F";
                System.out.println(firstname + " " + lastname + " " + score + " Your Grade:" + grades);
            }else {
                break;

            }
        }
        System.out.println("**Exit from Grade Calculator**");
    }
}