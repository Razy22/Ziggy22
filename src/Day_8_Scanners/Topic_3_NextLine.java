package Day_8_Scanners;

import com.sun.xml.internal.bind.v2.runtime.NamespaceContext2;

import java.util.Scanner;

public class Topic_3_NextLine {
    public static void main(String[] args) {

        //2) Next Line this will read everything on the line plus it assings it to the string

        Scanner FullName= new Scanner(System.in);
        System.out.println("Print your Full name here ");

        String name = FullName.nextLine();

        System.out.println("The Full Name is:" +name);





    }


}
