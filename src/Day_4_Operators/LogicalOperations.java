package Day_4_Operators;

public class LogicalOperations {
    public static void main(String[] args) {

        // and && if all the result to be true all of them should be true
        boolean balls= (12>7)&&(3<8)&&(9>=7);
        System.out.println(balls);

        boolean flowers = (true)&&(3<8)&&(8!=9);
        System.out.println(flowers);

        // || or it works if any of the operations is true it will return true

        boolean lilies = (9>11)||(6<9);  // 9 is grater than
        System.out.println(lilies);
        boolean shoes= ("razy"=="Razy")||('C'=='c');
        System.out.println(shoes);

        boolean q = !(((4==5)||(7<9)&&(8<=10)||(true)));
        System.out.println(q);




        //! not


    }
}
