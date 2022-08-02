package Day17_Arrayequals;

import java.util.Arrays;

public class Topic1_Arraycontains {
    public static void main(String[] args) {
        // containers that they contain multiple variables
        // in order for 2 array to be =
        // every value should be equal and the order have to be the same.
        int [] arr1 = {1,2,3,4};
        int [] arr2 = {1,2,3,4};
        boolean eq = Arrays.equals(arr1,arr2);
        System.out.println("our value:" +eq);
        //boolean bc we want to see if its t or f
        // the order is not the same there for is not equal even tho it contains the same nums.
     //   System.out.println("the arr 1 is:"+arr1);
      //  System.out.println("the arr 2 is:"+arr2); // this will come out as hashcode and is diff
        //the arr 1 is:[I@14ae5a5
        //the arr 2 is:[I@7f31245a
      //  Arrays.equals(arr1,arr2);
        System.out.println("+++++++++++++++top we used boolean++++++++++++++++++++++++");
        float [] arr3 = {2.0f,3.5f,4.3f,5.89f};
        float [] arr4 = {2.0f,3.5f,4.4f,5.89f};   // bc the numbers are not the same.
        // don't forget after every value we have to put f after bc it's a float
        System.out.println("Are they equal:" +Arrays.equals(arr3,arr4));
        System.out.println("+++++++diff topic++++++++");
        // assign array to each other
        int [] arr5 = {1,2,3,4,5,6,7,8,9};
        int [] arr6 = arr5;
        System.out.println("Array 6 is :"+Arrays.toString(arr6));
        System.out.println("Array 5 is :" + Arrays.toString(arr5));
        // what we did here we equales the new array to our made up list 5 and we
        // put array.to string when we printed the 6th array
        // it works both ways



    }
}
