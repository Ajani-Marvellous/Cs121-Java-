package weekSeven;

public class carInfo {
    //member variable also called Field
    //instance variable

    //States: representing the data and values
    String carName;
    int carModelYear;
    String carColor;

    //constructor
    //has to have public NameofYourClass()
    //Default constructor
    public carInfo() {
        this.carName = "No Name";
        this.carColor = "Not decided";
        this.carModelYear = 0000;
    }

    public carInfo(String Name, int CMY, String color) {
        this.carName = Name;
        this.carModelYear = CMY;
        this.carColor = color;

    }

    //behaviour
    //Method
    public void displayCarInfo() {
        System.out.printf("The name of the car is: %s\nCar model Year is: %d\nCar color is: %s\n", this.carName, this.carModelYear, this.carColor);
    }
}