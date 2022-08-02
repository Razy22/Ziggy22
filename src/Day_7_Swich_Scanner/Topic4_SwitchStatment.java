package Day_7_Swich_Scanner;


public class Topic4_SwitchStatment {

    // the it works is similar to if
    // if we have alot of cond, it is useful tool to use
    //How switch works:
    //1-The switch expression is evaluated once.
    //2-The value of the expression is compared with the values of each case.
    //3-If there is a match, the associated block of code is executed.

    public static void main(String[] args) {

        int number = 4;
        String Month = "";
        switch (number) {// where I put my variable;

            case 1: Month = "Jan";

                break;


            case 2: Month = "Feb";
                  break;

            case 3: Month= "Mar";
                   break;

            case 4: Month= "Apr";
                   break;

            case 5: Month= "May";
                break;

            case 6: Month= "Jun";
                break;

            default: Month= "Invalid Month";

        }
        System.out.println(" The month in a year is " +Month);
    }
}
