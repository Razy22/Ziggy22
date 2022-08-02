package Topic12_Breakstatement;

public class Topic2_BreakStatement {
    public static void main(String[] args) {
        // whatever thing is in foorloop it goes till the end
        // breakstatement comes out side of the for loop and it breaks the code
        // is most used in loop or nested loops loop inside loop and so on
        String hello ="hello";
        String result= "" ;
        for (int i=0; i<hello.length();i++){
            if (hello.charAt(i)=='l'){
                break;
            }
            result=result + hello.charAt(i);
        }
        System.out.println(result);
        System.out.println("**********************");
        //sum the num from 0to50inc but if my sum is over140 i want to stop
        int sum=0;
        for (int i=1; i<=50; i++){
            sum= sum+i;
            if (sum>=140){
              break;
            }
        }
        System.out.println("End Result" +sum);
        System.out.println("---------------------------------");
    }
}
