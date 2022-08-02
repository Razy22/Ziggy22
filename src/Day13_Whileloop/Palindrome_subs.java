package Day13_Whileloop;

import java.util.Scanner;

public class Palindrome_subs {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Please a string here: ");
        //**********************************created my string substring and int to count my strings
        String str = sc .next();
        String sub = "";
        int count=0;
        // created my fl and (i) said (i) is less than or equal to the string length - 3
        // and we put our substring and let it know that sub is sbubstr to str
        // boolean to compare the substrings
        // reversed string is == string rev then we leave it empty



        for (int i = 0; i <= str.length() - 3; i++) {
            sub = str.substring(i, i + 3);
            boolean bool = false;
            String rev = "";

            // creating another fl to let java know that we are comparing subs length and is -1
            // then adding reversed and = to sub.charat to determine the char of the subs and we are saying sub is the value of j

            for (int j = sub.length() - 1; j >= 0; j--) {
                rev = rev + sub.charAt(j);
            }


            if (sub.equals(rev)){
                bool=true;
                count++;
                // if our substring is same as our reversed sub then the sub is palindrome
                // plus count of the subs and inc it ++
            }



            else {
                bool=false;
                // or else is not palindrome
            }
            System.out.println(sub+ " Is substring a palindrome? "+bool +
                    "The count of palindromes in a string:"+str+count);
            // print out if my substring is palindrome then if it is true or f
            // then print out the count of the string and count the len
        }

    }
}
