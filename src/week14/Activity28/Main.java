package week14.Activity28;

import weekThirteen.Lab12.DataStructure;

public class Main {
    public static void main(String[] args){
        //create instance
        weekThirteen.Lab12.DataStructure DS = new DataStructure();

        //add items(age)
        DS.addAge(29);
        DS.addAge(34);
        DS.addAge(18);

        //add items(Student names)
        DS.addStudent("Marvellous");
        DS.addStudent("Sinclair");
        DS.addStudent("Chibuike");

        //add items (major and GPA)
        DS.addMajorGpa("Computer Science", 4.0);
        DS.addMajorGpa("Maths", 3.8);
        DS.addMajorGpa("English", 3.6);

        //add items (Nationality)
        DS.addNationality("Nigeria");
        DS.addNationality("American");
        DS.addNationality("Ghanian");

        //add items (hometowns)
        DS.addHometown("Abuja");
        DS.addHometown("New York");
        DS.addHometown("Accra");

        //add items (home state)
        DS.addHomeState("Lagos");
        DS.addHomeState("New Mexico");
        DS.addHomeState("Kumasi");

        // Display items
        System.out.println("\n***** Before Removing Items *****");
        DS.printArrayItems();
        DS.printStudentList();
        DS.printMajorGpaMap();
        DS.printNationalityList();
        DS.printHometownStack();
        DS.printHomeStateQueue();


        //remove
        DS.removeAge();
        DS.removeStudent("Marvellous");
        DS.removeMajorGpa("Computer Science");
        DS.removeNationality("American");
        DS.removeHometown();
        DS.removeHomeState();


        // Print items after removal
        System.out.println("\n*After Removing One Item*");
        DS.printArrayItems();
        DS.printStudentList();
        DS.printMajorGpaMap();
        DS.printNationalityList();
        DS.printHometownStack();
        DS.printHomeStateQueue();
    }
}