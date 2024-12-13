package weekTwo;

import javax.swing.*;

public class wordGame {
    //main + tab
    public static void main(String[] args) {

        String name;
        String city;
        String age;
        String career;
        String college;
        String animal;
        String petName;

        //prompt the user
        name = JOptionPane.showInputDialog("Enter in your name: ");
        city = JOptionPane.showInputDialog("Where are you from: ");
        age = JOptionPane.showInputDialog("Enter your age");
        career = JOptionPane.showInputDialog("Enter your career: ");
        college = JOptionPane.showInputDialog("Enter your college");
        animal = JOptionPane.showInputDialog("Enter your animal");
        petName = JOptionPane.showInputDialog("Enter your petName");

        //String.format()
        String message = String.format("The person %s is from %s. He is %s. He is a %s. He attends %s.He is mostly likely to get a %s and most likely to name it %s.",name ,city ,age ,career ,college,animal ,petName);

        //System.out.printf("The person %s is from Mustang,Ok. They are at Ball State University.",name);

        //Display Message in dialog box
        JOptionPane.showMessageDialog(null, message);


    }
}
