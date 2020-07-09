import java.util.Scanner;

public class DoubleClassAverageCCR {

    /* New Scanner Object */
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        /* Initialization Phase */
        /* Assigning Variables */
        double total = 0;
        int gradeCounter = 0;
        double grade; //Grade defined was double
        double average; //Average defined was double

        /* Reads user input and store inside "grade" */
        System.out.println(); //Blank line 
        System.out.println("Enter student grade or -1 to quit: ");
        grade = input.nextDouble();

        /* While loop - Controls the grades being entered by the user if the value is different than -1 */
        while (grade != -1){

            System.out.println("Enter student grade or -1 to quit : "); // Reads user input after 1st value was entered.
            grade = input.nextDouble();
            total += grade;

            gradeCounter++;
        }
        /* If statement - condition is if a grade was entered by the user */
        if (gradeCounter != 0) {
            /* Expression to calculate the average grade and saves into variable average */
            average = (double)total / gradeCounter;

            /* Output the result to the user */
            System.out.printf("%nThe total of the %d grades entered is %.2f%n" , gradeCounter, total); //Keeping 2 digits after the decimal point using %.2f
            System.out.printf("Class average is %.2f%n" , average); //Keeping 2 digits after the decimal point using %.2f
            System.out.println();
        } else {
            System.out.println("Error! No values for the grades was entered!");
        }
    }
}