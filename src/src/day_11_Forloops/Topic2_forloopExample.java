package src.day_11_Forloops;

public class Topic2_forloopExample {
    public static void main(String[] args) {
        // write a code where the prints all even num between 0 to 100

        // if a number is div by 2 w no reminder then it is a even num
        int totaliter=0;
        System.out.println("The even numbers:");
        for (int i= 0; i<=100;i++){
            if (i%2==0){
                System.out.println(" " +i);
            }
            totaliter++;


        }
        System.out.println("\n" + "total count ");
    }
}
