import java.util.Scanner;

public class ClassAverageCalculator {

    /* New Scanner Object */
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        /* Initialization Phase */
        double total = 0;
        int gradeCounter = 0;
        double grade;
        double average;

        System.out.println("Enter student grade or -1 to quit: ");
        grade = input.nextDouble();

        while (grade != -1){
            System.out.println("Enter student grade or -1 to quit : ");
            grade = input.nextDouble();
            total += grade;

            gradeCounter++;
        }
        /* If statement - condition is if a grade was entered by the user */
        if (gradeCounter != 0) {
            /* Expression to calculate the average grade and saves into variable average */
            average = (double)total / gradeCounter;

            /* Output the result to the user */
            System.out.printf("%nThe total of the %d grades entered is %.2f%n" , gradeCounter, total);
            System.out.printf("Class average is %.2f%n" , average);
            System.out.println();
        } else {
            System.out.println("Error! No values for the grades was entered!");
        }
    }
}
