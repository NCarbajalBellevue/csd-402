/*
 * Name: Natalia Carbajal
 * Date: 8/30/2026
 * Assignment: Module 4.2: Programming Assignment
 */

import java.util.Arrays;

public class CarbajalAssignment4_2 {

    // Returns the average of a short array
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array)
            sum += num;
        return (short)(sum / array.length);
    }

    // Returns the average of an int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array)
            sum += num;
        return sum / array.length;
    }

    // Returns the average of a long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array)
            sum += num;
        return sum / array.length;
    }

    // Returns the average of a double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array)
            sum += num;
        return sum / array.length;
    }

    public static void main(String[] args) {

        // Create arrays with different sizes
        short[] shortArray = {4, 8, 12};
        int[] intArray = {10, 20, 30, 40};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {2.5, 4.5, 6.5, 8.5, 10.5, 12.5};

        // Display each array and its average
        System.out.println("Short: " + Arrays.toString(shortArray) +
                " Average: " + average(shortArray));

        System.out.println("Int: " + Arrays.toString(intArray) +
                " Average: " + average(intArray));

        System.out.println("Long: " + Arrays.toString(longArray) +
                " Average: " + average(longArray));

        System.out.println("Double: " + Arrays.toString(doubleArray) +
                " Average: " + average(doubleArray));
    }
}