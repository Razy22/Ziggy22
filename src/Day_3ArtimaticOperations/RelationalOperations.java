package Day_3ArtimaticOperations;

import sun.awt.geom.AreaOp;

public class RelationalOperations {

    public static void main(String[] args) {
        int number = 10;
        //== (means is it true or faulse)

        boolean B1 = 10 == 10;
        System.out.println(B1);


        boolean B2 = ">"== "<";
        System.out.println(B2);

        boolean B4= 12>=200;
        System.out.println(B4);
        System.out.println(10>=200);

        // >= it checks any number that is grader or less than

        boolean B3 = 12 >= 10;
        System.out.println(B3);

        boolean b5 = 13<=15;
        System.out.println(b5);

        boolean B6 = 17<=16;
        System.out.println(B6);


        // 4th != if they are not eq then turns true if is not eq that will come out as faulse

        boolean B7 = 14 != 14;
        System.out.println(B7);

        boolean B8= 27 != 23;
        System.out.println(B8);

        // 5th is grater or less than it will be true otherwise will be faulse

        boolean B9= 14>15;
        boolean B10= 30>20;
        System.out.print(B9);
        System.out.println(B10);

        boolean B11= 11>9000;
        boolean B12=  900<100;

        System.out.println(B11);
        System.out.println(B12);


        boolean B13 = !(true == false);
        System.out.println(B13);

        boolean B14 = !(('C'=='c') == (13==14) == !(("er"=="Er") ==(true==true)));
        System.out.println(B14);












    }
}
