package Topic12_Breakstatement;

public class Topic5_Whileloop {
    public static void main(String[] args) {
       //the concept of while loop
       //we define the starting point before the word "while"
        // i used to be inside of the loop but here is not but
        // the end point is in the whole loop
        //iteration inside the curley brakets
        //step by step
        //1)int i =0 whatever number u start w // starting point is not required
        //2)while(condition i<10){
        //3)i++ or i-- or i+=10 or ..
        //}
        for (int i = 0; i < 10; i++) {
            // but over here ++i will first increment the value of i
            System.out.println(" "+i);
        }
        System.out.println( "-------------------");
        int i=0;
        while(i<10){
            System.out.println(" "+i);
            i++;
            //if u ++i is still the same because at this point i will stay the same
        }

    }
}
