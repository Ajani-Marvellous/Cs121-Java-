package weeekEight.packageDemo;

public class studentTest {
    public static void main(String[] args) {
        //create new instance of student
        Student studentOne  = new Student("Marvellous", "Computer Science", 123456, 2024, 4.0);

        //display content using getter methods
        System.out.println("Student Name: " + studentOne.getStudentName());
        System.out.println("Major: " + studentOne.getMajor());
        System.out.println("Student ID: " + studentOne.getStudentId());
        System.out.println("Student Year: " + studentOne.getYear());
        System.out.println("GPA: " + studentOne.getGpa());

        //update data
        studentOne.setMajor("Criminal Justices");
        studentOne.setGpa(3.9);

        System.out.println("\nUpdated information.");
        System.out.println("Major: " + studentOne.getMajor());
        System.out.println("GPA: " + studentOne.getGpa());
    }


}