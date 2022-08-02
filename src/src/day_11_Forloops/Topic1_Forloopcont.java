package src.day_11_Forloops;

public class Topic1_Forloopcont {
    public static void main(String[] args) {

        // for(startpoint ; endpoint; iteration){}
        //the code block will be ran
        //} this is how we declare for loop
        // write a for loop that incrs by 2for each iteration

        for (int i = 1;i<100;i += 2) {
            System.out.println("The value of i:"+i);
        }

        int count =0;
        for (int i =1; i<100; i +=2) {
            System.out.println("The value of i: " +i);
            count= count +1;
        }
        System.out.println(count);

    }
}
