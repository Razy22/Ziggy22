package src.day_11_Forloops;

public class Topic3_ReverseString {
    public static void main(String[] args) {
        //String are indexed
        //first char has index of 0
        // the last char in a string has index of length -1

        String Canrum = "fuck";
        Canrum.charAt(0);
        System.out.println(Canrum.charAt(0));
        System.out.println(Canrum.charAt(Canrum.length() - 1)); // last char at the string
        System.out.println(Canrum.charAt(Canrum.length() - 2));//second last
        System.out.println(Canrum.charAt(Canrum.length() - 3));//and so on
        System.out.println(Canrum.charAt(Canrum.length() - 4));

        String Reverse ="";

        for (int Raz = Canrum.length() - 1; Raz >= 0; Raz--) { // it will start from last ind l-1(3)
            Reverse = Reverse + Canrum.charAt(Raz); // we are not motifying reverse but we change the reverse point to


        }
        System.out.println(Reverse);
    }
}
