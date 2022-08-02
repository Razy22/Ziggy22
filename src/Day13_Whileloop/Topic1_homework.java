package Day13_Whileloop;

import java.util.Scanner;

public class Topic1_homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number:");
        int input= sc.nextInt();
        int sum= 0;
        for(int i =0; i<=input;i+=2){
            if (sum+i<=390){
                sum = sum+i;

            }else { break;

            }

        }
    }
}
