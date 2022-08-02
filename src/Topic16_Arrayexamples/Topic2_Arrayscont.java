package Topic16_Arrayexamples;

public class Topic2_Arrayscont {
    // find average age of pp in the array
    public static void main(String[] args) {
        int [] ages = {24,60,23,19,45,90};
        int sum = 0; // starting from 0

        for (int i = 0; i < ages.length; i++) {
            sum = sum + ages[i];


        }
        float val = (float) sum / ages.length;
        System.out.println("Print out the average of ages:" +val);


    }
}
