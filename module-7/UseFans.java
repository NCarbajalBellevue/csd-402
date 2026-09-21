/*
 * Name: Natalia Carbajal
 * Date: 9/19/2026
 * Assignment: Module 7.2 
 */

import java.util.ArrayList;

public class UseFans {

    // Displays information for a collection of fans
    public static void displayFans(ArrayList<Fan> fans) {
        for (Fan fan : fans) {
            displayFan(fan);
            System.out.println();
        }
    }

    // Displays information for one fan
    public static void displayFan(Fan fan) {
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On: " + fan.isOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
    }

    public static void main(String[] args) {

        // Create a collection of fans
        ArrayList<Fan> fans = new ArrayList<>();

        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.FAST, true, 10, "black");
        Fan fan3 = new Fan(Fan.SLOW, true, 8, "blue");

        // Add fans to the collection
        fans.add(fan1);
        fans.add(fan2);
        fans.add(fan3);

        // Display all fans
        System.out.println("All Fans:");
        displayFans(fans);

        // Display one fan
        System.out.println("One Fan:");
        displayFan(fan2);
    }
}