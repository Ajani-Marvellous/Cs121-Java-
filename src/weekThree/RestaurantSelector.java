package weekThree;

import java.util.Scanner;

public class RestaurantSelector {
    public static void main(String[] args) {
        //scanner instance
        Scanner scanner = new Scanner(System.in);

        //Declared variables
        String vegetarian,vegan,glutenF;

        //prompt the user
        //Recieve the user's input
        System.out.println("Is there anyone in your party that is vegetarian?");
        vegetarian = scanner.nextLine();

        System.out.println("Is there anyone in your party that is vegan?");
        vegan = scanner.nextLine();

        System.out.println("Is there anyone in your party that is glutten free?");
        glutenF = scanner.nextLine();

        //Output
        System.out.println("were are your resturant choices:\n");
        // ==
        // equals()
        //Logical And &&
        // LOgical OR ||
        // REsturant Names:
        String marve = "\nJoe's Gouret Burgers";
        String main = "\nMain Street pizza Company";
        String corners = "\nCorner's cafe";
        String mama = "\nMama's fine italian";
        String chef = "\nThe chef's kitchen";

        if(vegetarian.equals("no") && vegan.equals("no") && glutenF.equals("no"))
        {
            System.out.printf("\t%s Hello whats up blahhh",marve);
        }
        if(vegan.equals("no") && glutenF.equals("no")){
            System.out.printf("\t%s",mama);
        }
        if(vegan.equals("no")){
            System.out.printf("\t%s",main);
        }
        System.out.printf("\t%s%n\t%s",corners,chef);
    }
}
