package Topic12_Breakstatement;

public class Topic1_Breakstartement {
    public static void main(String[] args) {
        for (int i=9; i>0; i--){

            if (i%5==0){
                break;
            }
            System.out.println(i);
        }
        System.out.println("****************");
        for (int k =2; k <10; k+=2){

            if (k==4){
                break;
            }
            System.out.println(k);
        }

    }
}
