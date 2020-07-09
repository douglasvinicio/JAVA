import java.util.Scanner;

public class CircleCalculator {

    public static void main(String[] args){

        /* Assign Variables to store Diameter, Circumference, Area and Radius */
        double diameter, circumference, area, radius;

        /* Creating a new Scanner Object */
        Scanner input = new Scanner(System.in);

        /* Reads user radio input */
        System.out.println("Let's take the radius of circle to calculate its Diameter, Circumference and Area");
        System.out.println("Enter the radius of the circle: ");
        /* Store user input into radius variable */
        radius = input.nextDouble();

        /* Formula to calculate the Diameter */
        diameter = 2 * radius;

        /* Formula to calculate the Circumference */
        circumference = (2 * Math.PI * radius);

        /* Formula to calculate the Area */
        area = (Math.PI * Math.pow(radius,2));

        /* Output the result of the calculations */
        System.out.println("The Diameter of the circle is: " + diameter);
        System.out.printf("The Circumference is: %.4f \n", circumference);
        System.out.printf("The Area is: %.5f \n" , area);

    }
}

/*  Step-by-step Algorithm :
 * 1 - Assign Variables for store values.
 * 2 - Create a new Scanner object to read user radius input.
 * 3 - Reads user radius input.
 * 4 - Formula to calculate Diameter.
 * 5 - Formula to calculate Circumference.
 * 6 - Formula to calculate Area.
 * 7 - Output result to the user.
 */