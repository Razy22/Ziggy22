package Topic15_arrays;

public class Topic1_Arrays {
    public static void main(String[] args) {
      /*
   Write a code with following requirements:
- Define an array with values of {6,7,2,3,90,-2,-90,-122,96,35}
- Print the minimum number in the given array
       */
        int[] list = {27, 34, -88, 32, 65, 4, 6, 8, 9, 11, 33, 22, 44, 66};
        int max = list[1];

        for (int i = 0; i < list.length; i++) {
            if (max < list[i]) {
                max = list[i];
            }
        }
        System.out.println("Value of max number"+max);
    }
}
