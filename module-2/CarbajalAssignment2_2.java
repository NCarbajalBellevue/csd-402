/*
 * Name: Natalia Carbajal
 * Date: 8/23/2026
 * Assignment: Module 2.2: Programming Assignment
 * Description: This program lets the user play Rock-Paper-Scissors
 * against the computer. The computer randomly selects a choice,
 * and the program determines the winner.
 */

import java.util.Random;
import java.util.Scanner;

public class CarbajalAssignment2_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Get the computer's and user's choices
        int computer = random.nextInt(3) + 1;

        System.out.print("\nChoose a number:\n1: Rock\n2: Paper\n3: Scissors\n");
        int user = input.nextInt();

        // Make sure the user's choice is valid
        if (user < 1 || user > 3) {
            System.out.println("\nInvalid choice.");
            input.close();
            return;
        }

        String[] choices = {"", "Rock", "Paper", "Scissors"};

        System.out.println("\nComputer Played: " + choices[computer]);
        System.out.println("You Played: " + choices[user]);

        // Calculate the result
        if (computer == user) {
            System.out.println("\nTie!");
        } else if ((user == 1 && computer == 3) ||
                   (user == 2 && computer == 1) ||
                   (user == 3 && computer == 2)) {
            System.out.println("\nYou won");
        } else {
            System.out.println("\nComputer won");
        }

        input.close();
    }
}