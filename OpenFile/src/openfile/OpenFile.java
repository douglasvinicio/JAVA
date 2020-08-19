package openfile;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class OpenFile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of a file: ");
        String filename = input.nextLine();

        try {
            File file = new File(filename);
            Scanner inputFile = new Scanner(file);
            System.out.println("The file was found.");
        } catch (FileNotFoundException e) {
            System.out.println("The file was NOT found." + e.getMessage());
        }
        System.out.println("Done");
    }
}
