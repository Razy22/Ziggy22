package Topic16_Arrayexamples;

import java.util.Arrays;

public class Topic5_ArraysUtilCount {
    public static void main(String[] args) {
     // Array.sort(array)
     // the sort will be in increasing order
     int [] starter = {90,45,34,-90,-1000,400};
        Arrays.sort(starter); // lists your nums from small to big
        for (int i = 0; i < starter.length; i++) { //less to greater
            System.out.println(starter[i]);


        }
        System.out.println(Arrays.toString(starter));
        // this will put ur [-1000, -90, 34, 45, 90, 400]

        int [] starter2 = {78,34,5,-230,67};
        Arrays.sort(starter2);
        //System.out.println(Arrays.sort(srt2)); Arrays.sort(array name) will get teh array and sort it
        // assign  back to same  array
        System.out.println(Arrays.toString(starter2)); // again from less to grater

        String[]str3 = {"lawand","Aland","Ciarra","Baran"};
       // System.out.println(Arrays.toString(str3)); // print ur arrays
        Arrays.sort(str3);
        System.out.println(Arrays.toString(str3));


    }
}
