package Topic16_Arrayexamples;

public class Topic3_ArrayExample {
    public static void main(String[] args) {
        // if i want to swap the elements in my array list
        int [] swap = {30,90,70,60};

        int temp = swap[0]; // swaping from 0
        swap[0] = swap[1]; //{90,90} // instead of 30,90== we only switching 0 to 1
        swap [1] = temp ; //{90,30}

        String [] nam = {"Ziggy", "Nalla","Kincik"};
        String temp2 = nam[0];
        nam [0] = nam [1];
        nam [1] = temp2;

        System.out.println("The length of first string array is:" +nam[0].length());

    }
}
