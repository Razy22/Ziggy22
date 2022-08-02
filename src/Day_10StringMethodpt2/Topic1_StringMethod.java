package Day_10StringMethodpt2;

import java.util.Locale;

public class Topic1_StringMethod {
    public static void main(String[] args) {
        // substring() extracts the char from a string
        // beginning at specified start position.

        String str1="RazyAlbarznji";
        String substr1 = str1.substring(6);
        System.out.println(substr1);
        String substr2 = str1.substring(0);
        System.out.println(substr2);
        String substr3 = str1.substring(3,6);
        System.out.println(substr3);
        String substr4 = str1.substring(3,str1.length());
        System.out.println(substr4);

        // toLowercase() converts a string to lowercase letter.
        String str2 = "YasEEN";
        String lowstr1 = str2.toLowerCase();
        System.out.println(lowstr1);
        // toUppercase() same thing
        String upstr2 = str2.toUpperCase();
        System.out.println(upstr2);

        // trim() removes whitespace from both ends of a string

        String str3 = " Cev dat ";
        String trstr3 = str3.trim();
        System.out.println(str3);





    }

}
