package Demo2_Arraysize;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Topic1_combining_arrays {
    public static void main(String[] args) {
        // How to combine 2 arrays into 1 array
        int[] a1 = {110, 230, 450, 540, 200, 400};
        int[] a2 = {220, 560, 900, 640, 570, 800, 1000};
        int[] a3 = new int[a1.length + a2.length];

        for (int i = 0; i < a1.length; i++) {
          a3 [i] = a1[i];



        }
        int k = 0;
        for (int i = a1.length; i < a3.length; i++) {
            a3 [i] = a2[k];
            k++;


        }
        System.out.println("Print my whole list"+ Arrays.toString(a3));
    }
}

