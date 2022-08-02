package Day_5_IdStatements;

public class Topic3_IfStatementcont {
    public static void main(String[] args) {
        //3 diff numbs
        //print max numb
        // by using logical operation if statement
        // comepares3 diff numbers + print max numb

        int num1= 199;
        int num2= 27;
        int num3= 189;

        /*
        boolean bool1 = num1>num2 && num1>num3;
        boolean bool2 = num2>num1 && num2>num3;
        boolean bool3 = num3>num1 && num3>num2;
        */


        if(num1>num2 && num1>num3){
            System.out.println("the max number is:" +num1);
        }

        if(num2>num1 && num2>num3){
            System.out.println("the max number is: " +num2);
        }

        if(num3>num1 && num3>num2){
            System.out.println("the max number is: " +num3);
        }





    }
}
