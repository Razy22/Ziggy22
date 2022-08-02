package Day_8_Scanners;

import java.util.Scanner;

public class Topic2_NextandNextLine {
    public static void main(String[] args) {
        Scanner St= new Scanner(System.in);

        System.out.println("Put something on the console here");


        String something = St.next();


        System.out.println("The thing you put in is:" +something);


        System.out.println("Enter something that have space in it" );


        String Nam = St.nextLine(); //

        System.out.println("The thing that you entered is:" +Nam);

        System.out.println("");







    }
}
