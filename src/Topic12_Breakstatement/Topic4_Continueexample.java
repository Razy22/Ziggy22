package Topic12_Breakstatement;

public class Topic4_Continueexample {
    public static void main(String[] args) {
        //write a code where it checks every char in a string
        //and when it sees L or A pass
        // print the end result
        String ex = "HELLOAPPLE";
        String result = "";

        for (int i=0; i<ex.length(); i++){
            if (ex.charAt(i)== 'L' || ex.charAt(i)=='A'){
                continue;
            }
            result = result + ex.charAt(i); // when i=0 ==> result="", result=" "+"H"
                                           // when i = 1 ==> result="H" == H+E==> result = "HE"
                                          // when i == 4 == result = HE == HE+"O"
        }
        System.out.println(result);
    }
}
