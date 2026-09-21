/*
 * Name: Natalia Carbajal
 * Date: 9/20/2026
 * Assignment: Module 8.2
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CarbajalArrayListTest {

    // Finds the largest number in the list
    public static Integer max(ArrayList list) {

        if (list.isEmpty()) {
            return 0;
        }

        Integer largest = (Integer) list.get(0);

        for (int i = 1; i < list.size(); i++) {
            Integer number = (Integer) list.get(i);

            if (number > largest) {
                largest = number;
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers and enter 0 to stop.");

        int number;

        do {
            System.out.print("Enter number: ");
            number = input.nextInt();

            if (number != 0) {
                numbers.add(number);
            }

        } while (number != 0);

        // Display the largest number
        System.out.println("Largest number: " + max(numbers));

        // Test an empty list
        ArrayList<Integer> empty = new ArrayList<>();
        System.out.println("Empty list result: " + max(empty));

        input.close();
    }
}