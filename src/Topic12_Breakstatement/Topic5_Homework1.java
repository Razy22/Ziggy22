package Topic12_Breakstatement;

import java.util.Scanner;

public class Topic5_Homework1 {
    public static void main(String[] args) {
        //- Write a code where user is asked to enter a integer number
        //- print all the numbers that can NOT be divided by 2, or 5 and Also can be
        // divided by 7 between 1 to entered number(included)
        // (use the Continue Statement)
        // 1st add a scanner
        // then name and stick it to scanner
        //create ur forloop
        // then if in ur foorloop
        // if else after for the divisible numbers of 2 or 5
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter an Integer");

        int input= sc.nextInt();

        for (int i = 0; i <= input ; i++) {
            if (i%7 ==0){
                continue;
            } else if (i %2 == 0 || i % 5 ==0) {
                continue;
            }else{
                System.out.println(i);
            }

        }
    }
}
