package Day_8_Scanners;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Topic1_Scanner {

    public static void main(String[] args) {

        // we creating Scanner obj.
        Scanner input= new Scanner(System.in);


        // how to scan the short data type input.
        System.out.println("please enter the short number:");
        short sh= input.nextShort();

        System.out.println("The number that the used entered is"+sh);

        System.out.println("Please enter the short number");
        int In = input.nextInt();

        System.out.println("The Interger number is:" +In);

        System.out.println("Please inter the Double number here:");
        double Da = input.nextDouble();
        System.out.println("The double number is " +Da);

        System.out.println("Please enter the float number here:");
        float fl = input.nextFloat();
        System.out.println("The float number is " +fl );

        

        



    }

}
