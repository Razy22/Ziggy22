package Day_9_Strings;

public class Topic1_Strings {
    public static void main(String[] args) {
        //string literal/ string Str="class1"// created from the pool and java will pull it from its memory ;
        //string object we create a new object with the string.
        //Strings are emutable but we can change the referance
        //string str1= new String("class1")//heap memory you create a new one



      String str2="Hello";
      str2="Helo";
      String str6 ="Helo";
      String str7 = new String( "Helo");

        System.out.println(str2);
        System.out.println(str2 == str6);
        System.out.println(str6== str7);

    }
}
