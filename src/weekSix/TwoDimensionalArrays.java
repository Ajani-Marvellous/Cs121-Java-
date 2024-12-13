package weekSix;

public class TwoDimensionalArrays{
    public static void main(String[] args) {
        String[][] array1 ={};
  /*  String[][] array1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12},

    };

   */

        // Print array1 elements using a standard for loop
        System.out.println("Integer 2D Array:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println(); // New line after each inner array
        }

        // 2. Create a 2D array of doubles using 'new' keyword and initialize values
        double[][] array2 = new double[4][3];
        array2[0][0] = 1.1;
        array2[0][1] = 2.2;
        array2[0][2] = 3.3;
        array2[1][0] = 4.4;
        array2[1][1] = 5.5;
        array2[1][2] = 6.6;
        array2[2][0] = 7.7;
        array2[2][1] = 8.8;
        array2[2][2] = 9.9;
        array2[3][0] = 10.10;
        array2[3][1] = 11.11;
        array2[3][2] = 12.12;

        // Print array2 elements using an enhanced for loop
        System.out.println("\nDouble 2D Array:");
        for (double[] row : array2) {
            for (double element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // 3. Create and print a 2D array of Strings
        String[][] array3 = {
                {"apple", "banana", "cherry"},
                {"dog", "elephant", "fox"}
        };

        // Print array3 elements using a standard for loop
        System.out.println("\nString 2D Array:");
        for (String[] row : array3) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}








