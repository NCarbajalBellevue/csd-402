/*
 * Name: Natalia Carbajal
 * Date: 9/27/2026
 * Assignment: Module 9.2
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Carbajal_Mod9_2 {

    // Creates the file if it does not already exist
    public static File getFile() throws IOException {

        File file = new File("numbers.txt");

        if (file.createNewFile()) {
            System.out.println("A new file was created.");
        } else {
            System.out.println("Using the existing file.");
        }

        return file;
    }

    // Writes 10 random numbers to the file
    public static void addNumbers(File file) throws IOException {

        FileWriter writer = new FileWriter(file, true);
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            writer.write((random.nextInt(100) + 1) + " ");
        }

        writer.close();
    }

    // Reads the numbers from the file
    public static void readNumbers(File file) throws IOException {

        Scanner input = new Scanner(file);

        System.out.println("Numbers in the file:");

        while (input.hasNextInt()) {
            System.out.print(input.nextInt() + " ");
        }

        System.out.println();

        input.close();
    }

    public static void main(String[] args) {

        try {

            File file = getFile();

            addNumbers(file);

            readNumbers(file);

        } catch (IOException e) {
            System.out.println("There was a problem with the file.");
        }
    }
}