package Day17_Arrayequals;

import java.util.Arrays;

public class Topic3_StringMethodsinArrays {
    public static void main(String[] args) {
        String s = "Raz is a tech student";
        // split is a great method to use and most common used in string array list
        // split goes one by one element ,it goes through all the elements one by one.
        String [] names = s.split("_"); //== IT WILL COME OUT AS IT IS IN MY STRING S.
        //The Array is:[R, a, z,  , i, s,  , a,  , t, e, c, h,  , s, t, u, d, e, n, t]
        // the top is when I put nt in my spl.
        // split whenever you see the space in my sent
        // but split doesn't work on
        //The Array is:[R, z is ,  tech student this will happen when I entered "a" in my split
        // it splits whatever letter but one char is ?+ *%

        System.out.println("The Array is:"+ Arrays.toString(names));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++=EX2");
        String ja = "Java is my main language";
        String [] name2 = ja.split("m"); // then we put the first st and then we .method
        System.out.println("THE OTHER ELEMENT IS :"+Arrays.toString(name2));

        String house = "House price went up this year by 20%";
        String [] arr2 = house.split(" ");
        System.out.println("SPLIT VALUE IS:"+ Arrays.toString(arr2));
        // SPLIT METHOD IT ONLY WORKS WITH STRING




    }
}
