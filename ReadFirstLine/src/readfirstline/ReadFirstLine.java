package readfirstline;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFirstLine {

    public static void main(String[] args) throws FileNotFoundException {

        //Create a new Scanner object
        Scanner input = new Scanner(System.in);

        //Get the filename
        System.out.println("Enter the filename: ");
        String filename = input.nextLine();

        //Open the file
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        //Read the first line from the file
        String line = inputFile.nextLine();

        //Display the line
        System.out.println("The first line in the file is: ");
        System.out.println(line);

        //Close the file
        inputFile.close();

    }
}
