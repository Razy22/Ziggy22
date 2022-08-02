package Java;
import java.util.Scanner;

public class Calc_revanue {
    public static void main(String[] args) {
        Scanner maximum= new Scanner(System.in);

        System.out.println("Sold Product:");
        int product= maximum.nextInt();

        System.out.println("Price of product:");
        int price= maximum.nextInt();


        int revenue= price* product;
        System.out.println("total revenue = $"+ revenue);


    }
}
