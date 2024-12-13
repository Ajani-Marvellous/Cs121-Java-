package weekTen.abstractClass;

public class testAbstractClass {
    public static void main(String[] args) {
        user Marve = new customer("Marve", 123457890, "marve@gmail.com", "pass246", "Table for 4");
        Marve.displayDetails();

        user Sinc = new staff("Sinc", 987654321, "sinc@gmail.com", "pass81012", "Director");
        Sinc.displayDetails();
    }
}
