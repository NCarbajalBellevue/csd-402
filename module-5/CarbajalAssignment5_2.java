/*
 * Name: Natalia Carbajal
 * Date: 9/20/2026
 * Assignment: Module 5.2
 */
public class CarbajalAssignment5_2 {

    // Finds the location of the largest value in a double array
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Finds the location of the largest value in an int array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Finds the location of the smallest value in a double array
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Finds the location of the smallest value in an int array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static void main(String[] args) {

        // Create an int 2D array
        int[][] intArray = {
            {3, 8, 2},
            {14, 1, 9},
            {7, 6, 5}
        };

        // Create a double 2D array
        double[][] doubleArray = {
            {3.5, 8.2, 2.1},
            {14.9, 1.3, 9.8},
            {7.4, 6.6, 5.0}
        };

        // Find largest and smallest values
        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);
        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        // Display the locations
        System.out.println("Largest int at: (" +
                largestInt[0] + ", " + largestInt[1] + ")");

        System.out.println("Smallest int at: (" +
                smallestInt[0] + ", " + smallestInt[1] + ")");

        System.out.println("Largest double at: (" +
                largestDouble[0] + ", " + largestDouble[1] + ")");

        System.out.println("Smallest double at: (" +
                smallestDouble[0] + ", " + smallestDouble[1] + ")");
    }
}