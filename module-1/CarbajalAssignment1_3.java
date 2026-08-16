import java.util.Scanner;
public class CarbajalAssignment1_3 {
    public static void main(String[] args) {
        // Creates a Scanner to get input from the user
        Scanner myObj = new Scanner(System.in);

        // Asks the user to enter the amount of water in kilograms
        System.out.println("Enter water weight in kilograms:");
        float waterMass = myObj.nextFloat();
        // Asks the user to enter the initial temperature in Celsius
        System.out.println("Enter the celsius initial temperature of the water in:");
        float initialTemperature = myObj.nextFloat();
        // Asks the user to enter the final temperature in Celsius
        System.out.println("Enter the celsius final temperature of the water:");
        float finalTemperature = myObj.nextFloat();

        // Calculates the energy needed to heat the water in joules
        float Q;
        Q = waterMass * ( finalTemperature - initialTemperature ) * 4184;

        // Outputs the amount of energy needed
        System.out.println("The energy needed to heat the water is: " + Q + " joules.");

        // Closes the Scanner
        myObj.close();  
    }
}