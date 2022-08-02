package Week2;

import java.util.Random;
import java.util.Scanner;

public class interview_question3 {
    public static void main(String[] args) {
        /**
         *
         * // Guessing game
         * //Please follow the step in the below
         *
         * // Step 1-  Create 2 int variables with name of randomNumber , userInput;
         *
         * //Step 2- Create a program will generate random a number between 1 to 10
         *
         * to generate a random number use >>
         *
         *  Random random=new Random();
         *  int randomNumber = random.nextInt(10) + 1;
         *
         *
         * // Step 2- Ask user to enter a number to enter a number between 1-10
         *
         * //Step 3-  Create a logic with do while loop that will ask user
         * to enter a number as long as random number and userInput are not matching.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 10");
        Random random = new Random();
        //create an integer and put the next.int
        int randomNumber = random.nextInt(10) + 1;
        int ran;

        do {
            ran = sc.nextInt();
            if (ran == randomNumber){
                System.out.println("****** You Are Correct *****");
                break;
            }else if (ran < randomNumber){
                System.out.println("**** Sorry try grater number ****  ");
            } else if (ran > randomNumber) {
                System.out.println("**** Try smaller number ****");

            }else {
                System.out.println("**** Error Try Again ****");
            }
        } while (true);







    }
}
