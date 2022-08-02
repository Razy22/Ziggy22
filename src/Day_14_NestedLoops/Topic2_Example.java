package Day_14_NestedLoops;

public class Topic2_Example {
    public static void main(String[] args) {
        for (int i = 0; i <=5; i++) {
            System.out.println("From outer loop==> I valur "+i); //5*
            for (int j = 0; j <=5; j++) {
                System.out.println("    From inner loop==> J value    "+j);//25*

                for (int k = 0; k <=5; k++) {
                    System.out.println("    From inner inner loop==> K value    "+k); //125*

                }

            }

        }
    }
}
