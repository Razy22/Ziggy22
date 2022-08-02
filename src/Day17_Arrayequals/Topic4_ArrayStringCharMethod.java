package Day17_Arrayequals;

import java.util.Arrays;

public class Topic4_ArrayStringCharMethod {
    public static void main(String[] args) {
     // another method , ex: WE HAVE A STRING AND IF WE USE CHAR TO CHAR METHOD IT WILL
     // GRAB EVERY CHAR AND PUTS IT IN ARRAY BUT WE USE NAME.tocharArray()
     String name1 = "IgetannoyedwithZiyasHomework";
     //String [] chararr = name1.toCharArray(); // common mistake for char method we use the wrd
        // char array instead of string array cool.
        char [] chararr = name1.toCharArray();
        System.out.println("The char value is :" + Arrays.toString(chararr));
        System.out.println("+++++++++++++++++++++++EX2");
        String name2 = "NlahaZiggyKIncik";
        char[] ChaArray2 = name2.toCharArray();
        System.out.println("MY VALUE IS:" +Arrays.toString(ChaArray2));


    }
}
