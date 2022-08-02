package Topic12_Breakstatement;

public class Topic3_ContStatement {
    public static void main(String[] args) {
        //if u run ur code and if it contains continue it will pass that
        //iteration int for loop


       // print all the nums between 0-10 10 not included
        //except nums,3,6,9
        for (int i = 0; i < 10; i++) { //0,1,2,3,4,5,6,7,8,9,10
            System.out.println("before continue" +i);
            if (i==3 || i==6 || i==9){
                continue;
            }
            System.out.println("After continue" +i);


        }
    }
}
