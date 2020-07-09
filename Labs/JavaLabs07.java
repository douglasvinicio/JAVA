import java.util.Scanner;

public class JavaLabs07 {

    /* New Scanner Object */
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int gender;

        double A1, A2, A3, A4, A5, B; //Variables to store results and formulas.
        double bodyFat, bodyWeight, hip, forearm, wrist, waist; //Measures Inserted by the user.
        double bodyFatPercentage;

        /* Taking user input */
        System.out.println("Let's calculate your body fat!");
        System.out.println("Choose your gender: \n 1 - Woman \n 2 - Man");
        gender = input.nextInt();

        /* Showing error message if wrong option is selected */
        if (gender != 1 && gender != 2) {
            System.out.println("Error! Please choose one of the two options.");
        }

        /* Woman  */
        if ( gender == 1 ){

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

        if ( gender == 2){

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

/*
ICA-3
--------
Body fat formula for women:
A1 = (Body weight x 0.732) + 8.987
A2 = Wrist measurement (at fullest point) / 3.140
A3 = Waist measurement (at navel) x 0.157
A4 = Hip measurement (at fullest point) x 0.249
A5 = Forearm measurement (at fullest point) x 0.434
B = A1 + A2 – A3 – A4 + A5
Body fat = body weight – B
Body fat percentage = body fat x 100 / body weight

Body fat formula for men:
A1 = (Body weight x 1.082) + 94.42
A2 = Waist measurement x 4.15
B = A1 – A2
Body fat = body weight – B
Body fat percentage = body fat x 100 / body weight

Write a program to calculate the body fat of a person.
*/