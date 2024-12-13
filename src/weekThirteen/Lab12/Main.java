package weekThirteen.Lab12;

public class Main {
    public static void main(String[] args){
        //create instance
        DataStructure DS = new DataStructure();

        //add items(age)
        DS.addAge(20);
        DS.addAge(12);
        DS.addAge(45);
        DS.addAge(34);

        //add items(Student names)
        DS.addStudent("Marvellous");
        DS.addStudent("Bala");
        DS.addStudent("Ayo");
        DS.addStudent("tosco");

        //add items (major and GPA)
        DS.addMajorGpa("Cyber security", 4.0);
        DS.addMajorGpa("Nursing", 3.5);
        DS.addMajorGpa("Biology", 3.4);
        DS.addMajorGpa("criminal justice", 3.8);

        //add items (Nationality)
        DS.addNationality("Nigeria");
        DS.addNationality("American");
        DS.addNationality("Canadian");
        DS.addNationality("Mexican");

        //add items (hometowns)
        DS.addHometown("Fortwayne");
        DS.addHometown("Agunda");
        DS.addHometown("Ipaja");
        DS.addHometown("Ayobo");

        //add items (home state)
        DS.addHomeState("Ibadan");
        DS.addHomeState("Muncie");
        DS.addHomeState("Mushin");
        DS.addHomeState("Ajegunle");

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
        DS.removeStudent("Marve");
        DS.removeMajorGpa("Cyber security");
        DS.removeNationality("Nigeria");
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