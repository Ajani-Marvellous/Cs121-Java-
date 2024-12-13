package week14.Activity28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DataStructure<T, U> {
    private T[] agelist; // Flexible for any type
    private int ageIndex = 0; // Index to track elements in the array
    private ArrayList<T> studentList = new ArrayList<>(); // Flexible for any type
    private HashMap<T, U> majorGpaMap = new HashMap<>(); // Keys and values can be any type
    private LinkedList<T> nationalityList = new LinkedList<>(); // Flexible for any type
    private Stack<T> hometownStack = new Stack<>(); // Flexible for any type
    private Queue<T> homeStateQueue = new LinkedList<>(); // Flexible for any type

    // Constructor to initialize the array
    @SuppressWarnings("unchecked") // Suppresses type safety warnings
    public DataStructure(int arraySize) {
        agelist = (T[]) new Object[arraySize]; // Generic array initialization workaround
    }

    // Add methods for all data structures
    public void addAge(T age) {
        if (ageIndex < agelist.length) {
            agelist[ageIndex++] = age;
        } else {
            System.out.println("Array is full. Cannot add more elements.");
        }
    }

    public void addStudent(T name) {
        studentList.add(name);
    }

    public void addMajorGpa(T major, U gpa) {
        majorGpaMap.put(major, gpa);
    }

    public void addNationality(T nationality) {
        nationalityList.add(nationality);
    }

    public void addHometown(T hometown) {
        hometownStack.push(hometown);
    }

    public void addHomeState(T state) {
        homeStateQueue.offer(state);
    }

    // Remove methods for all data structures
    public void removeAge() {
        if (ageIndex > 0) {
            agelist[--ageIndex] = null; // Clear the last element
        } else {
            System.out.println("Array is empty. Cannot remove elements.");
        }
    }

    public void removeStudent(T name) {
        studentList.remove(name);
    }

    public void removeMajorGpa(T major) {
        majorGpaMap.remove(major);
    }

    public void removeNationality(T nationality) {
        nationalityList.remove(nationality);
    }

    public void removeHometown() {
        if (!hometownStack.isEmpty()) {
            hometownStack.pop();
        } else {
            System.out.println("No hometowns to remove.");
        }
    }

    public void removeHomeState() {
        if (!homeStateQueue.isEmpty()) {
            homeStateQueue.poll();
        } else {
            System.out.println("No home states to remove.");
        }
    }

    // Print methods for all data structures
    public void printArrayItems() {
        System.out.println("Array contents:");
        for (T item : agelist) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public void printStudentList() {
        System.out.println("List of students:");
        for (T name : studentList) {
            System.out.println(name);
        }
    }

    public void printMajorGpaMap() {
        System.out.println("Major and GPA map:");
        for (T major : majorGpaMap.keySet()) {
            System.out.printf("%s: %s\n", major, majorGpaMap.get(major));
        }
    }

    public void printNationalityList() {
        System.out.println("List of nationalities:");
        for (T nationality : nationalityList) {
            System.out.println(nationality);
        }
    }

    public void printHometownStack() {
        System.out.println("Stack of hometowns:");
        for (T hometown : hometownStack) {
            System.out.println(hometown);
        }
    }

    public void printHomeStateQueue() {
        System.out.println("Queue of home states:");
        for (T state : homeStateQueue) {
            System.out.println(state);
        }
    }
}
