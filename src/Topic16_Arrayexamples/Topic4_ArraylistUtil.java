package Topic16_Arrayexamples;

import java.util.Arrays;

public class Topic4_ArraylistUtil {
    public static void main(String[] args) {
      int [] val = {3,4,5,2,1,-90,-230};
        for (int i = 0; i < val.length; i++) {
            System.out.println(val[i]);
            /*
            3
            4
            5
            2
            1
            -90
            -230
             */


        }
        System.out.println("value of Hashcode" +val); //hashcode
        System.out.println("Value of the Array" +Arrays.toString(val));// our array val{};

        // if I want to print my String Array
        String [] name= {"Nalah", "Ziggy", "Kincik"};
        System.out.println("My Cats names : " +Arrays.toString(name));
        System.out.println(name); // hashcode


    }
}
