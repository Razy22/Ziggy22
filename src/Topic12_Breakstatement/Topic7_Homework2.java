package Topic12_Breakstatement;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Topic7_Homework2 {
    public static void main(String[] args) {
        //- Write a code where user is asked to enter a string
        // create a new string with entered string but do not include 'L' 'M', 'T' 'E' in the new string
        // - print the new string
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your capitalized word here:");
        String input= sc.nextLine();
        String result= " ";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)=='L'|| input.charAt(i)== 'M' || input.charAt(i)== 'T' || input.charAt(i)== 'E'){
                continue;
            }
            result=result+input.charAt(i);


        }
        System.out.println(result);

    }
}
