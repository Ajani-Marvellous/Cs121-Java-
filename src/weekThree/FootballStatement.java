package weekThree;

import java.util.Scanner;

public class FootballStatement {
public static void main(String[] args) {

    //create an instant of the scanner
    Scanner scan = new Scanner(System.in);

    //character
    //prompt
    System.out.println("Name of favourite football player (mercy,ronaldo,mbappe,oshimen): ");
    String Player = scan.nextLine();
    //String
    switch(Player) {
        case "mercy":
            System.out.println("mercy");
            break;

        case "ronaldo":
            System.out.println("ronaldo");
            break;
        case "mbappe":
            System.out.println("mbappe");
            break;
        case "oshimen":
            //sout + tab
            System.out.println("oshimen");
        default:
            System.out.println("invalid");

    }


}


}
