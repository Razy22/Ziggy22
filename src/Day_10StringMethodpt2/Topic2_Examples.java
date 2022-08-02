package Day_10StringMethodpt2;

import java.util.Locale;
import java.util.Scanner;

public class Topic2_Examples {
    public static void main(String[] args) {
        //user is asked to enter a valid email(username)
        //Enter a pass where the password is at least 9 char

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a valid email address");
        String email=sc.next();

        System.out.println("Enter at least 9 char password");
        String password= sc.next();
        String formatedemail =email.toLowerCase();

        //mygmail@GMAil.com


    }
}
