import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutputFile {
    public static void main(String[] args) throws FileNotFoundException {
        String desktop = System.getProperty ("user.home") + "/Desktop/";
        Scanner inFile = new Scanner(new FileReader(desktop + "inData.txt" ));
        PrintWriter outFile = new PrintWriter(desktop + "outData.txt");

        double length, width, radius, beginningBalance , interestRate , parameter, area;
        int age; char ch;


        String firstName, lastName;
        double updatedSalary;
        int percentagePayIncrease;

        firstName = inFile.next();
        lastName = inFile.next();
        updatedSalary = inFile.nextDouble();
        percentagePayIncrease = inFile.nextInt();



        // Initialization Phase

        // length = inFile.nextDouble();
        // width = inFile.nextDouble();


        // Processing Phase;

        // parameter = 2 * (length + width);
        // area = length * width;
        // Termination phase;

        outFile.println("the last name of the employee is " + lastName +
                ",the first name is " + firstName +
                ", the current salary is " + updatedSalary +
                ", and the pay increase is" + percentagePayIncrease + ".");

        //outFile.printf("Rectangle : %nLength = %.2f, width = %.2f" + ",area = %.2f, parameter = %.2f %n%n",length,width,area,parameter);


        outFile.close();

    }
}

/*
ICA-3
--------
Three employees in a company are up for a special pay increase. You are
given a file, say inData.txt, with the following data:

Miller Andrew 65789.87 5
Green Sheila 75892.56 6
Sethi Amit 74900.50 6.1

Each input line consists of an employee’s last name, first name, current salary,
and percent pay increase. For example, in the first input line, the last name of
the employee is Miller, the first name is Andrew, the current salary is
65789.87, and the pay increase is 5%. Write a program that reads data from
the specified file and stores the output in the file outData.txt. For
each employee, the data must be output in the following form: firstName
lastName updatedSalary. Format the output of decimal numbers to two
decimal places.
*/