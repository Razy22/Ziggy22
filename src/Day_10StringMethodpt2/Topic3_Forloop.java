package Day_10StringMethodpt2;

public class Topic3_Forloop {
    public static void main(String[] args) {
        //loops will help you on continus condition
        //you will always need to specify
        //starting point
        //ending point
        //iteration
        for (int i = 0; i< 20 ; i+=2){
            //for(starting ; endpoint/condition ; iteration){} we use curley brakets for floop

            System.out.println("Increase" +i);
        } // post increment runs the code block then it increase it by 1
        for(int j = 10 ; j >0; j--){
            System.out.println("Decrease"+j);
        }
    }
}
