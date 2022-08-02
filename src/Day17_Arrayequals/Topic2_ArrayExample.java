package Day17_Arrayequals;

import java.util.Arrays;

public class Topic2_ArrayExample {
    public static void main(String[] args) {
        // add two arrays in to one array
        int [] arr1 ={20,30,40,50};
        int [] arr2 ={60,70,80,90,100};
        // we have to ent a size to the empty array
        int size = arr1.length+arr2.length;
        int [] arr3 = new int [10]; //this is my staging for arr1&arr2


        for (int i = 0; i < arr1.length; i++) {
            // arr3[i] = 0

        arr3[i]= arr1[i]; // i =0 arr3[0] = arr1[0] ==2


        }
        int k = 0;
        for (int i = arr1.length; i < size; i++) {
            arr3[i] = arr2[k];
            k++;


        }
        System.out.println("Array 2 in my list:"+ Arrays.toString(arr3));




    }
}
