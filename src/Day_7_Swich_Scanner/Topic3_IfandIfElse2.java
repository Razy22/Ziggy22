package Day_7_Swich_Scanner;

public class Topic3_IfandIfElse2 {

    public static void main(String[] args) {

        String cls = "JAVA";
        String Class1 ="Advanced";
        String Class2 ="Intermediate";
        String Class3 ="Not advanced";

        if(cls == "JAVA"){
            if (Class1 == "Advance"){
                System.out.println("Person is added to Class 1 which is advanced");
            } else if (Class2 == "Intermediate") {
                System.out.println("Person added to Class 2 is intermediate");

            }else {
                System.out.println(" Person added to Not Advanced");
            }
        }

    }
}
