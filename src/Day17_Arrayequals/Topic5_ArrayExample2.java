package Day17_Arrayequals;

import java.util.Arrays;

public class Topic5_ArrayExample2 {
    public static void main(String[] args) {

        //write a code where you will get all the words in a String and put it into an array and reverse is
        String ex = "Life is cool";
        String []exArrays = ex.split("");
        System.out.println("In side is:"+Arrays.toString(exArrays));
        // if I want to reverse it is {hard is life}

        String [] reverse = new String[exArrays.length];

        int k = 0;
        for (int i = exArrays.length-1; i >=0 ; i--) {
            reverse [k] = exArrays [i];
            k++;

        }
        System.out.println("REVERSED RESULT IS :"+Arrays.toString(reverse));

    }
}
