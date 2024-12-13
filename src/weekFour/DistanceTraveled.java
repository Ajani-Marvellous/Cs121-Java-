package weekFour;
import java.util.Scanner;

public class DistanceTraveled {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the speed in mph: ");
        double speed = scanner.nextDouble();

        // Ask the user to enter the number of hours spent travelling
        System.out.print("Enter the number of hours travelled: ");
        int hours = scanner.nextInt();

        // Close the Scanner
        //scanner.close();

        // print the table header
        System.out.printf("%-10s %-15s%n", "Hour", "Distance Traveled");

        // Use a loop to calculate and print the distance for each other
        for (int hour = 1; hour <= hours; hour++) {
            double distance = speed * hour;
            System.out.printf("%-10d %-15.2f%n", hour,distance);
        }
    }

}
