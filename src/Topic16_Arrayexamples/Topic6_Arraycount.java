package Topic16_Arrayexamples;

public class Topic6_Arraycount {
    public static void main(String[] args) {
     String [] sap= {"Ziggy", "Nala"}   ;
     String temp1 = sap[0]; // temp1 = Ziggy
     sap[0]= sap[1]; // ziggy is Nala
     sap[1]= temp1; // Nala , Ziggy

        System.out.println("The length of the string in array list is:"+sap[0]);
    } // if I put +sap[0] only this will give me Nala bc we switched ziggys index to Nala.

}
