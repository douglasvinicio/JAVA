import java.util.Scanner;

public class BodyFatCalculator{

    /* New Scanner Object */
    static Scanner input = new Scanner(System.in);

    /* Main method */
    public static void main(String[] args){

        /* Assigning Variable gender as integer to store user input from a list and avoid typo errors */
        int gender;
        int woman = 1;
        int man = 2;
        

        double A1, A2, A3, A4, A5, B; //Variables to store results and formulas.
        double bodyFat, bodyWeight, hip, forearm, wrist, waist; //Measures entered by the user.
        double bodyFatPercentage;

        /* Taking user input */
        System.out.println("Let's calculate your body fat!");
        System.out.println("Choose your gender: \n 1 - Woman \n 2 - Man");
        gender = input.nextInt();

        /* Showing error message if wrong option is selected */
        if (gender != 1 && gender != 2) {
            System.out.println("Error! Please choose one of the two options.");
        }

        /* Woman Section */
        if ( gender == woman ){

            /* Read user inputs for woman */
            System.out.println("Enter the Body Weight: ");
            bodyWeight = input.nextDouble();
            System.out.println("Enter the Wrist measurement (at fullest point): ");
            wrist = input.nextDouble();
            System.out.println("Enter the Waist measurement (at navel): ");
            waist = input.nextDouble();
            System.out.println("Enter the Hip measurement (at fullest point): ");
            hip = input.nextDouble();
            System.out.println("Enter the Forearm measurement (at fullest point): ");
            forearm = input.nextDouble();

            /* Formulas and Results for Woman body fat percentage */
            A1 = (bodyWeight * 0.732) + 8.987;
            A2 = wrist / 3.140;
            A3 = waist * 0.157;
            A4 = hip * 0.249;
            A5 = forearm * 0.434;
            B = (A1 + A2) - A3 - (A4 + A5);
            bodyFat = bodyWeight - B;
            bodyFatPercentage = bodyFat * 100 / bodyWeight;

            /* Output the result */
            System.out.printf("The body fat weight is %.2f%% \n" , bodyFat);
            System.out.printf("The body fat percentage is %.2f%% \n" , bodyFatPercentage);
        }

        /* Man Section */
        if ( gender == man){

            /* Read user inputs for man */
            System.out.println("Enter the Body Weight: ");
            bodyWeight = input.nextDouble();
            System.out.println("Enter the Waist measurement (at navel): ");
            waist = input.nextDouble();

            /* Formulas and Results for Man body fat percentage */
            A1 = (bodyWeight * 1.082) + 94.42;
            A2 = waist * 4.15;
            B = A1 - A2;
            bodyFat = bodyWeight - B;
            bodyFatPercentage = bodyFat * 100 / bodyWeight;

            /* Output the result */
            System.out.printf("The body fat weight is %.3f \n" , bodyFat);
            System.out.printf("The body fat percentage is %.2f%% \n" , bodyFatPercentage);
        }
    }
}