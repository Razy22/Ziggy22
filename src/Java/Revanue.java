package Java;
import java.util.Scanner;
public class Revanue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Scanner maximumnumber= new Scanner(System.in);
        System.out.println("Print out Maximum Number");

        System.out.println("Enter first number:" );
        int num1;
        num1= sc.nextInt();

        System.out.println("Enter second number:" );
        int num2;
        num2=sc.nextInt();

        System.out.println("enter third number:" );
        int num3;
        num3=sc.nextInt();
        if (0>1){
            System.out.println("Your maximum number is positive"+ num1);
        } else if (0<1) {
            System.out.println("Your maximum number is negative"+ num2);


        } else if (0==0){
            System.out.println("Your Maximum number is zero"+num3);

        }


    }
}
