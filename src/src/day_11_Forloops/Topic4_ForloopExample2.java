package src.day_11_Forloops;

import java.util.Locale;
import java.util.Scanner;

public class Topic4_ForloopExample2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Please enter a string ");
        String FromScan= sc.next();

        for (int i =0; i<FromScan.length(); i++){
            if (FromScan.charAt(i)== 'A' || FromScan.charAt(i) == 'a' ){
                FromScan = FromScan.toUpperCase();
            }else {
                FromScan = FromScan.toLowerCase();
            }

        }
        System.out.println(FromScan);
    }
}
