
package Day_9_Strings;

import java.util.Scanner;

public class Homework_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a name that starts with A and ends with L here:");

        String firstName= "Angel";
        String result = sc.next();

        if(firstName.startsWith("A") && firstName.endsWith("L")) {
            System.out.println(firstName.replaceFirst("A","B"));
        }

        }


        //ask user to enter a name
        // If the name starts with "A" and ends with "L"
        // then replace "A" with B and print the result
        //* If Name Start with “B” and ends with “L” also Contains “A”
        // replace the second character of the name with “G”
        // if the name starts with C and ends with K, check is the name equal to clark or CLARK.




    }

