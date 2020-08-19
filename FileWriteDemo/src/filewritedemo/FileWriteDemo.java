package filewritedemo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriteDemo {

    public static void main(String[] args) throws FileNotFoundException {
        String filename;
        String friendName;
        int numFriends;

        /* Scanner object for keyboard input */
        Scanner input = new Scanner(System.in);

        //Get the number of friends
        System.out.println("How many friends do you have?");
        numFriends = input.nextInt();

        //Consume the remaining new line character.
        input.nextLine();

        //Get the filename.
        System.out.println("Enter the filename: ");
        filename = input.nextLine();

        //Open the file and give the name input in filename
        PrintWriter outputFile = new PrintWriter(filename);

        //Get data and write it to the file
        for (int i = 1; i <= numFriends; i++) {
            //Get the name of friend
            System.out.println("Enter the name of friend number " + i + " : ");
            friendName = input.nextLine();

            //Write the name to the file
            outputFile.println(friendName);
        }

        //Close the file
        outputFile.close();
        System.out.println("Done! Data written to the file.");
    }
}
