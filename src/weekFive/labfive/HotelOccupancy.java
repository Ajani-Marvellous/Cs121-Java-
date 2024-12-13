package weekFive.labfive;

import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        // Creating an instance of the Scanner class
        Scanner keyboard = new Scanner(System.in);

        int floors;
        int totalRooms = 0;
        int totalOccupiedRooms = 0;

        // Ask the user how many floors the hotel has
        System.out.print("How many floors does the hotel have? ");
        floors = Integer.parseInt(keyboard.nextLine());

        // Use a for loop to iterate through the hotel
        for (int i = 1; i <= floors; i++) {
            // Prompt the user to enter rooms on the current floor
            System.out.print("Enter the number of rooms on floor " + i + ": ");
            int rooms = Integer.parseInt(keyboard.nextLine());

            System.out.print("How many rooms are occupied on floor " + i + "? ");
            int occupiedRooms = Integer.parseInt(keyboard.nextLine());

            totalRooms += rooms;
            totalOccupiedRooms += occupiedRooms;
        }

        // Calculate vacant rooms and occupancy rate
        int totalVacantRooms = totalRooms - totalOccupiedRooms;
        double occupancyRate = (double) totalOccupiedRooms / totalRooms * 100;

        // Display results
        System.out.printf("Total Floors: %d%nTotal Rooms: %d%nOccupied Rooms: %d%nVacant Rooms: %d%nOccupancy Rate: %.2f%%\n",
                floors, totalRooms, totalOccupiedRooms, totalVacantRooms, occupancyRate);

        // Close the scanner
        keyboard.close();
    }
}
