package WeekEight.packageDemo;

public class person {
    // Two public instance fields/variables
    // public : means that a variable or method can be accessed anywhere
    //          in the program as long as there is an instance of the class to call it from
    //          person personOne = new person():
    //          personOne.firstName
    //          personOne.lastName
    //          personOne.age ---> ??
    public String firstName;
    public String lastName;

    // Three private instance fields/variables
    private int age;
    private String address;
    private double salary;

    //construtor: parameter constructor
    //Take in 5 parameters.
    public person(String firstName, String lastName, int Age, String Address, double Salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = Age;
        this.salary = Salary;


    }
    public void displayPersonContent(){
        System.out.printf("Full Name: %s %s\nAge:%d\nAddress:%s\nSalary:%.2f",firstName,lastName,age,address,salary);

    }
    private void displayAge(){
        System.out.println("Age" + age);

    }
    //Access Modifier:protected
    protected void displayAddress(){
        System.out.println("\nAddress"+ address);

    }
    void displaySalary(){
        System.out.println("Salary"+ salary);

    }

    // 00P Concept : #1 Encapsulation
    //SETTERS AND GETTERS

    public void setAge(int age){
        this.age = age;

    }
    public void setAddress(String address){
        this.address = address;
    }
    public void getSalary(double salary){
        this.salary = salary;
    }
    //Getters(Acessors)
    public int getAge(){
       return age;
    }
    public String getAddress(){
        return address;
    }
    public double getSalary(){
        return salary;
    }
}
