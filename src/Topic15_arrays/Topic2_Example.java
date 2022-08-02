package Topic15_arrays;

public class Topic2_Example {
    public static void main(String[] args) {
        /*
  write a code with following requirements
- define an array with following values {90,34,23,87,45,36,98}
- Print the values that can be divided by 2 or 3
         */
       int [] list = {90,34,23,87,45,36,98};
        int start = list[1];
       for (int i = 0; i < list.length; i++) {
           if (list[i]%3==0 || list[i]%2==0){
               System.out.println("Number is divisible by 2 or 3 :" +(list[i]));
           }

        }

    }
}
