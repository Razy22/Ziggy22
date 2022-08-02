package Topic16_Arrayexamples;

import java.util.Scanner;

public class Topic1_Example1 {
    public static void main(String[] args) {
        /*
- User is asked to enter a string,
- Use that string to see how many of 3 character substring is Palindrome
- Print All the substring Palindrome Substrings
- Example of Substring: word ==> "banana" 3 characters Palindrome substrings are ==> "ana", "nan" "ana". Count is 3.
PS = This is a little hard question please give your best and make sure you only use the things we have learned so far.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String:");
        String input = sc.next();
        int count = 0;
        for (int i = 0; i <= input.length()-3; i++) {
            String sub = input.substring(i,i+3);

            String rev = " ";
            for (int j = sub.length()-1; j >=0 ; j--) {
                rev =rev + sub.charAt(j);

            }
            if (rev.equals(sub)){
                count++;
                System.out.println("Palindrome Substring is:" +sub);
            }

        }
        System.out.println("The total count of palindrome:"+count);




        
    }
}
