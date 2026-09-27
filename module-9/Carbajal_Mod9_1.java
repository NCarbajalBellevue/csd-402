/*
 * Name: Natalia Carbajal
 * Date: 9/27/2026
 * Assignment: Module 9.1
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Carbajal_Mod9_1 {

    // Displays the items with their numbers
    public static void showItems(ArrayList<String> items) {

        int number = 0;

        for (String item : items) {
            System.out.println(number + ": " + item);
            number++;
        }
    }

    // Gets the user's choice
    public static String getChoice(Scanner input) {

        System.out.print("Enter the number of an item: ");

        return input.nextLine();
    }

    // Displays the item selected by the user
    public static void showSelected(ArrayList<String> items, String choice) {

        try {
            int number = Integer.parseInt(choice);

            // Auto-boxing
            Integer selected = number;

            // Auto-unboxing
            int index = selected;

            System.out.println("You selected: " + items.get(index));

        } catch (NumberFormatException e) {
            System.out.println("Out of Bounds");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
    }

    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<>();

        items.add("Laptop");
        items.add("Keyboard");
        items.add("Mouse");
        items.add("Monitor");
        items.add("Headphones");
        items.add("Printer");
        items.add("Tablet");
        items.add("Camera");
        items.add("Speaker");
        items.add("Controller");

        Scanner input = new Scanner(System.in);

        System.out.println("Choose an item from the list:");
        showItems(items);

        String choice = getChoice(input);

        showSelected(items, choice);

        input.close();
    }
}