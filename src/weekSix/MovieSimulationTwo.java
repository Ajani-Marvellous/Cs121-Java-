package weekSix;
import java.util.Random;
public class MovieSimulationTwo {

    private static final int Row = 5;
    private static final int Column = 10;

    public static void main(String[] args) {

        // Declare arrays using String[] format
        String[] movieNames = {"Jumanji", "Matrix", "Star Wars", "Oppenheiner"};
        String[] movieTypes = {"20", "30", "20",};
        double[] moviePrices = {15.25, 20.15, 18.11, 22.12};

        //Movie details
        displayDetails(movieNames, movieTypes, moviePrices);

        //Seat availabilty
        int[][] movieAvailability = new int[Row][Column];
        seatAvailability(movieAvailability);

        // Display seat availability
        System.out.println("\n----------INITIAL SEATS------------");
        displaySeatAvailability(movieAvailability);

        // Randomize seat availability
        randomizeAvailability(movieAvailability);

        // Display seat availability
        System.out.println("\n----------RANDOM GENERATED SEATS----------");
        displaySeatAvailability(movieAvailability);
    }

    // Method to display movie details
    public static void displayDetails(String[] movieNames, String[] movieTypes, double[] moviePrices) {
        System.out.printf("%-20s %-15s %-10s%n", "Movie Name", "Type", "Price");
        for (int i = 0; i < movieNames.length; i++) {
            System.out.printf("%-20s %-15s $%-10.2f%n", movieNames[i], movieTypes[i], moviePrices[i]);
        }
    }

    // Method to set seat availability to all available (0)
    public static void seatAvailability(int[][] availability) {
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                availability[i][j] = 0; // 0 = available
            }
        }
    }

    // Method to randomize seat availability
    public static void randomizeAvailability(int[][] availability) {
        Random random = new Random();
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                availability[i][j] = random.nextInt(2); // Randomly set to 0 (available) or 1 (occupied)
            }
        }
    }

    // Method to display seat availability
    public static void displaySeatAvailability(int[][] availability) {
        System.out.println("Seating Availability: [1 = unavailable ; O = available]");
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                System.out.printf(" %s ", availability[i][j] == 0 ? "0" : "1");
            }
            System.out.println();
        }
    }
}