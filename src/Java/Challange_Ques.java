package Java;
import java.util.Scanner;
public class Challange_Ques {
    public static void main(String[] args) {
        Scanner maximumnumber= new Scanner(System.in);
        System.out.println("Welcome to Maximum Finder");

        System.out.println("Please enter your fist number :");
        int firstNum = maximumnumber.nextInt();
        System.out.println("firstNum="+firstNum);

        System.out.println("Please enter your second number:");
        int secondNum= maximumnumber.nextInt();
        System.out.println("secondNum="+secondNum);

        System.out.println("please enter your third number:");
        int thirdNum= maximumnumber.nextInt();
        System.out.println("third number="+thirdNum);
        
        String result;
        
        if (firstNum>secondNum && firstNum>thirdNum){
            result="Fist number is the maximum number we have";
            System.out.println("result number=" +result);

            
        } else if (secondNum>firstNum && secondNum>thirdNum ) {
            result="Second number is the maximum number we have";
            System.out.println("result number=" +result);


            
        } else if (thirdNum>secondNum && thirdNum>firstNum) {
            result="Third number is the maximum number";
            System.out.println("result="+result);

        }else {
            result="solid";
        }
    }
}
