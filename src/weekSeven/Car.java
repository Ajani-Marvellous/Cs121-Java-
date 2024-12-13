package weekSeven;

public class Car {
    //main method
    public static void main(String[] args){
        String name = "Camry";
        String names [] = {"Camry", "Rolls Royce", "Lambo"};

        //create an instance of my student class
        carInfo Car1 = new carInfo("Camry",2005, "Green");
        carInfo Car2 = new carInfo();
        Car1.displayCarInfo();
        Car2.displayCarInfo();
    }
}