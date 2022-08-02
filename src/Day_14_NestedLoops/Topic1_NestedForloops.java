package Day_14_NestedLoops;

public class Topic1_NestedForloops {
    public static void main(String[] args) {
        /*
        Lopp{ //outer loop
        blahblahblah
        loop{ inner loop
        blahblahblahblahblah
        }
        }
         */
        int week= 3; // for each week we have 7 days

        int days = 7;
        for (int i = 1; i <=week; i++) {      //outter loop
            System.out.println("Week"+i);

            for (int j =1; j<=days; j++ ){ // inner loop
                System.out.println("Days:" +j);

            }

        }
    }
}
