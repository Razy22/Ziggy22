package Day_4_Operators;

public class UnaryOperation {
    public static void main(String[] args) {

        int num= 10;
        num = +num;

        System.out.println(num);

        int num1 = -10;
        num1 = +num1;
        System.out.println(num1);


        int num2 = -20;
        num2 = -num2;
        System.out.println(num2);

        int num3 = 30 ;
        num3 = -num3;
        System.out.println(num3);


        //Increasment operator (++) inc num by 1

        int num4 = 8;
        num4++;

        System.out.println(num4);

        //decreasment operator -- decreases the num by 1

        int num5 = 30;
        num5--;
        System.out.println(num5);

        // ! not invert it inverts the boolean values if its t is f if is f is true.

        boolean bool= true;
        bool= !bool;
        System.out.println(bool);








    }
}
