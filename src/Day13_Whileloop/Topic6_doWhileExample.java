package Day13_Whileloop;

public class Topic6_doWhileExample {
    public static void main(String[] args) {
        // sum all the even numbs between 0-100 included;

        int i=2;
        int total = 0;
        do {
            if(i ==78){ // no 78 but increase
                i+=2;
                continue;
            }
            if (i==100){
                break;
            }
            total = total+i;
            i=i+2;


        }while (i<=100); // adding all the even number to 100
        System.out.println("Sum of all the even numbers is:"+total);

    }
}
