import java.util.Random;
import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random random = new Random();
        final int SIZE = random.nextInt(8) + 3;
        int [] testScores = new int[SIZE];
        char [] letterGrades = new char[SIZE];


        System.out.printf("Enter your %d test scores\n", SIZE);
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("Enter test %d score: ", i + 1);
            testScores[i] = scnr.nextInt();
        }

        getLetterGrade(testScores, SIZE, letterGrades);
        printGrades(SIZE, testScores, letterGrades);
        printHighestScore(testScores);
        printLowestScore(testScores);
        printAverageScore(testScores);
    }

    public static void getLetterGrade(int [] testScores, int SIZE, char [] letterGrades) {
        char grade;
        for (int i = 0; i < SIZE; i++) {
            if (testScores[i] >= 90) {
                letterGrades[i] = 'A';
            } else if (testScores[i] >= 80) {
                letterGrades[i] = 'B';
            } else if (testScores[i] >= 70) {
                letterGrades[i] = 'C';
            } else if (testScores[i] >= 60) {
                letterGrades[i] = 'D';
            } else if (testScores[i] >= 50) {
                letterGrades[i] = 'E';
            } else{
                letterGrades[i] = 'F';
            }
        }
    }

    private static void printGrades( int SIZE, int[] testScores, char[] letterGrades) {
        System.out.printf("%-12s%s\n","Score", "Grade ");
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%-12d%s\n", testScores[i], letterGrades[i]);
        }
    }

    private static void printHighestScore(int[] testScores) {

        System.out.println();

        int max = Integer.MIN_VALUE;
        for (int score: testScores) {
            if (score > max) {
                max = score;
            }
        }
        System.out.printf("The highest score is %d\n",max);
    }

    private static void printLowestScore(int[] testScores) {

        int min = Integer.MAX_VALUE;
        for (int score: testScores) {
            if (score < min) {
                min = score;
            }
        }
        System.out.printf("The lowest score is %d\n",min);
    }

    private static void printAverageScore(int[] testScores) {
        double sum = 0;

        for (int score: testScores) {
            sum += score;
        }
        double average = sum / testScores.length;
        System.out.printf("Average score is %.1f\n",average);
    }


}
