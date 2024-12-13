package WeekEight.packageDemo;

public class personTest {
    public static void main(String[] args){
        //Instantiate the person object
        person personOne = new person("john", "Doe", 30, "123 Ela St",55000.00);
        person personTwo = new person("john","Doe", 30, "123 Ela St",44000.00);

        personOne.displayPersonContent();
        personTwo.displayPersonContent();

        personOne.lastName = "DoeA";
        personTwo.lastName = "DoeB";

        personOne.setAge(34);
        personTwo.setAddress("1318 w main");

        //Try to access displayAge() method with a access modifier as private
        personOne.displayAddress();
        personOne.displaySalary();

        //Display updated information
        //personOne.displayPersonContent();
        //personTwo.displayPersonContent();

    }
}
