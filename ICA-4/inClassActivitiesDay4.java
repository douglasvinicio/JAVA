/*
Author : Douglas Vinicio
Date : July 6,2020
Purpose : Read data from a file, format and write the formatted data in a new file.
 */

// Importing Packages 
import java.io.FileNotFoundException; 
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class inClassActivitiesDay4 {
    public static void main(String[] args) throws FileNotFoundException {
        /* Creating Scanner and PrintWriter */
        String desktop = System.getProperty("user.home") + "/Desktop/"; // Getting Desktop Path in MAC OS.
        Scanner inFile = new Scanner(new FileReader(desktop + "inData.txt")); // Reading file inData.txt
        PrintWriter outFile = new PrintWriter(desktop + "outData.txt"); // Creating file ourData.txt

        /* Assigning Variables */
        String firstName, lastName; // Assigning First and Last name as a String;
        double currentSalary; // Current Salary assigned as double;
        double percentagePayIncrease; // Percentage increase of the salary assigned as double;

        /* While loop to read every line of the file */
        while (inFile.hasNext()) {
            firstName = inFile.next();
            lastName = inFile.next();
            currentSalary = inFile.nextDouble();
            percentagePayIncrease = inFile.nextDouble();

            /* Write formatted data into new file "outData.txt */
            outFile.printf("The last name of the employee is " + lastName +
                            ", the first name is " + firstName +
                            ", the current salary is $%,.2f, and the pay increase is %.1f%%" + ". \n",
                            currentSalary, percentagePayIncrease);
        }
        
        inFile.close(); // Closing inFile
        outFile.close(); // Closing outFile

    }
}