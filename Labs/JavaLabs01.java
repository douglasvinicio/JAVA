import java.util.Scanner;

public class JavaLabs01 {
    // Assigning Constant Variables outside the main method;
    static final double CENTIMETERS_PER_INCH = 2.54;
    static final int INCHES_PER_FOOT = 12;

    public static void main(String[] args){

        /* Assigning Variables and Creating Scanner */
        Scanner input = new Scanner(System.in); //Creating a new scanner;

        /* Variables for store values */
        int feet;
        int inches;
        int totalInches;
        double centimeters;

        /* Read user input for Feet and Inches */
        System.out.println(); //Blank line
        System.out.println("Let's convert two values, insert two values one for Feet and one for Inches. \n");
        /* Feet Input */
        System.out.println("Enter feet: ");
        feet = input.nextInt();
        /* Inches Input */
        System.out.println("Enter inches: ");
        inches = input.nextInt();
        /* Output showing the numbers entered by the user */
        System.out.println("The numbers you entered are " + feet + " and " + inches + " for inches.");

        /* Formula / Expression to convert feet into inches */
        feet = feet * INCHES_PER_FOOT;

        /* Formula to sum the total of inches input by the user */
        totalInches = feet + inches;
        /* Output informing the total of inches entered by the user */
        System.out.println("The total number of inches is = " + totalInches + ".");

        /* Formula to convert the total of inches to centimeters */
        centimeters = totalInches * CENTIMETERS_PER_INCH;

        /* Output showing the user the convertion to centimenters*/
        System.out.println("The total of inches converted to centimeters are = " + centimeters + "cm.");

    }
}

/*  Step-by-step Algorithm :
* 1 - Assign Const Variables for being used in the formulas.
* 2 - Create a new Scanner object to read user input.
* 3 - Assign Variables to store feet, inches, total inches and centimeters.
* 4 - Takes user input for feet.
* 5 - Takes user input for inches.
* 6 - Output user feet and inches input.
* 7 - Convert feet to inches.
* 8 - Sum feet converted to inches to inches input by user.
* 9 - Output the sum of inches.
* 10 - Convert inches to centimeters.
* 11 - Output the converted value to centimeters.
 */
