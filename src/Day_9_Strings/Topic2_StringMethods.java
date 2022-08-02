package Day_9_Strings;

public class Topic2_StringMethods {
    public static void main(String[] args) {
        String name = "Renas";



       // char art() returns the char at the spicified index (position)
        String str= "Renas";
        char firstL = str.charAt(3);
        System.out.println(str.charAt(3));

        //concat () appends a string to the end of another string string

        String str1= "name0";
        String str2= "name1";

        String str3 =str1.concat(str2);
        System.out.println(str3);

        String str4 =str1 + str2;
        System.out.println(str4);

        //contains () checks if the string contains a sequence of characters sequence is important
        String name1 = "gulay";
        boolean YN= name1.contains("la");
        System.out.println(YN);

        // endwitch()  checks weather a string ends w the specific char(s)  boolean
        boolean YN1 =name1.endsWith("ay");
        System.out.println(YN1);

        // equals()  compares 2 strings returns true if the strings are quals
        String name2= "Sam";
        String name3= "Jason";
        boolean YN3= name2.equals(name3);
        System.out.println(YN3);
        System.out.println(name2==name3);

        // indexOf()  Return the position of the first found occurrence of specified char in a string.
        String name5 = "banana";
        int ind= name5.indexOf('n');
        System.out.println(ind);

        // isEmpty() checks weather the string is empty or not
        String emp ="";
        System.out.println(emp.isEmpty());

        //last indexof() returns the position of the last found occurrence of specified char in a string
        int lst= name5.lastIndexOf('a');
        System.out.println(lst);

        //* length return the length of a specified string or size of the string
        String str150= "lalallalalallalalalalallalaaaaa";
        int count= str150.length();
        System.out.println(count);

        //Replace searches a string for a specified value, and returns a new string
        //where the specified value are replaced String.

        String name123= "Razy";
        String name124=name123.replace('R','Z');
        System.out.println(name124);

        //ReplaceFirst() replace the first occurrence of a sub string that matches the
        //given regular expression with the given replacement.
        System.out.println(name123.replaceFirst("Ra" , "B"));

        //StartsWith() checks if a string starts w a specified char
        String name125= "Ziggy";
        boolean Zi = name125.startsWith("Z");
        System.out.println(name125);








    }
}
