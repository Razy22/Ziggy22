package Day13_Whileloop;

public class Topic5_dowhileloop {
    public static void main(String[] args) {
        // the concept for do while loop
        //do{
        //code block
        //}while(condition);
        int i = 30;
        do {
            System.out.println("The i value" + i);
            ++i;
        } while (i < 10);  // exit point when is not corr then it will exit out


        // int j =0;
        //  while (j<10){
        //   j++;
        int j= 9;
        do {
            if (j < 10) {
                System.out.println("The i value" + j);
                ++j;
            }
        } while (j < 10) ;

    }
}

