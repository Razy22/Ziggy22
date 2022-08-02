package Day13_Whileloop;

public class Topic2_Whileloopcount {
    public static void main(String[] args) {
        int i=0;
        while (i<10){
           // i++;
            System.out.println("The i value" +i);
            i++;   // if u increase i on the bottom starts from 0 to 9
            // if is on top then after while then its gonna start w 1 to 10
        }
        System.out.println("---------------------------");
        int j =0;
        while(j<=10){
            //j=j+2; // in here you will still have 8 not init but it
            if (j==8){
                continue;
            }
            System.out.println("the even numbs "+j);
            j=j+2;
            System.out.println("--------------------------------");
             int k =0;
             while (k<=10){
                 System.out.println("value of k" +k);// will print 9
                 if (k==9){
                     break;
                 }
                // System.out.println("value of k"+k); will not print 9
                 k++;
             }
        }
    }
}
