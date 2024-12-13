package HashMap;

public class MainClass {
    public static void main(String[] args) {
        // Create an instance of FlightReservation
        FlightReservation flightReservation = new FlightReservation();

        flightReservation.addReservation("SR4656", "wizkid, DET654, 4A");
        flightReservation.addReservation("SR8769", "davido, AM125, 6B");
        flightReservation.addReservation("SR8965", "burna boy, ST245, 30C");


        flightReservation.displayAllReservations();

        flightReservation.removeReservation("SR8965");

        System.out.println("\nReservations after removal:");
        flightReservation.displayAllReservations();
    }
}
