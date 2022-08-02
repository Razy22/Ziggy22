    package Week2;

    public class interview_questions2 {
        public static void main(String[] args) {
            //Create a program that will reverse a string , Please use While loop.
            String s1 = "Ziggy";        // i entered my cat's name
            String rev = " ";        // after creating another string for my reversed string then we create


           int i = s1.length() -1;  // an int and call it i and i is the length of our first string
            while(i >= 0 ){     // while i is greater or equal to 0

                // then out rev string is equal to s1 and every character in s1 is equal to rev

            rev += s1.charAt(i);
            i -- ;
            }
            System.out.println("Print out the reversed word:" + rev);




        }
    }
