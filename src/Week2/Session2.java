package Week2;

public class Session2 {
    public static void main(String[] args) {
        //If, else if,else / used when there is a one condition

        //if else else if is used to find an answet for multiple choices or possibilities.

        // step1- creating variable

        double bill= 0; // we will use double to store the answer.

        int callAmount= 140;

        //Step 2 Initialize our logic

        if(callAmount <=100){
            bill=200;

        } else if(callAmount>100 && callAmount <=150) {
            bill = 200 + ((callAmount - 100) * 0.60);
        }
        else if(callAmount>150 && callAmount <=200) {

            bill = 200 + (50 * 0.60) + ((callAmount -150)* 0.50);

            
        } else if (callAmount>200) {
            bill= 200 +(50* 0.60) + (50* 0.50) + ((callAmount - 200)* 0.40);


            
        }
        System.out.println("Call Amount:" + callAmount);
        System.out.println("Bill:" + bill);


    }
}
