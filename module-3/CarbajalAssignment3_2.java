/*
 * Name: Natalia Carbajal
 * Date: 8/23/2026
 * Assignment: Module 3.2: Programming Assignment
 * Description: This program uses nested for loops to display
 * a pattern of numbers that increase and then decrease.
 */

public class CarbajalAssignment3_2 {

    public static void main(String[] args) {

        // Create the rows of the pattern
        for (int row = 1; row <= 7; row++) {

            String line = "";

            // Add spaces to center the numbers
            for (int space = 7; space > row; space--) {
                line += "  ";
            }

            // Print numbers increasing
            int number = 1;
            for (int i = 1; i <= row; i++) {
                line += number + " ";
                number *= 2;
            }

            // Print numbers decreasing
            number /= 4;
            for (int i = 1; i < row; i++) {
                line += number + " ";
                number /= 2;
            }

            // Print the row with @ in the same position
            System.out.printf("%-50s@%n", line);
        }
    }
}