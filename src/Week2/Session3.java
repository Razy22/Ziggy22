package Week2;

import java.util.Scanner;

public class Session3 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Hey what is your team name?");

        String userTeam=scanner.nextLine();
        String TeamMascot="";

        if(userTeam=="team1"){
            TeamMascot="eagles";
        }else if (userTeam=="team2"){
            TeamMascot="lion";

        } else if (userTeam=="team3") {
            TeamMascot="unicorns";

        } else if (userTeam=="team4") {
            TeamMascot="Star";

        }else if(userTeam=="team5"){
            TeamMascot="dragon";

        } else if (userTeam=="team6") {
            TeamMascot="bulls";

        }else {
            TeamMascot="unknown";
        }


    }
}
