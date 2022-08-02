package Week2;

import java.util.Scanner;

public class Interview_Question1 {
    public static void main(String[] args){
           //    (String) Remove Duplicates
          //    Write a return method
         //    that can remove the duplicated values from String
        //    Ex:  removeDup("AAABBBCCCDDD")  ==> ABCD

        String input = "AAABBBCCCDDD"; // using this string to input this..
        String output= ""; // our answer

        for (int i = 0; i < input.length(); i++) { // using length string method

            if (!(output.contains(""+input.charAt(i)))){ // if to put the characters that we dont need
                // in our word
                output +="" + input.charAt(i); // characters or letters of result
            }
        }

        System.out.println("Output:" +output);






    }
}
