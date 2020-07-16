import java.util.Scanner;

public class AreaVolumeCalculator {

    /* New Scanner object*/
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        /* User input */
        int optionSelected;

        /* Variable controlling the loop*/
        boolean run = true;

        /* Loop running until user enters -1 */
        while (run) {
            // Here your code
            System.out.println("Sample Output:\n" +
                    "------------------\n" +
                    "This program can calculate the area of a rectangle, the area of a circle, or volume of a cylinder.\n" +
                    "To run the program enter:\n" +
                    "1: To find the area of rectangle.\n" +
                    "2: To find the area of a circle.\n" +
                    "3: To find the volume of a cylinder.\n" +
                    "-1: To terminate the program.");


            /* Read user input - Option to run the program */
            optionSelected = input.nextInt();

            if (optionSelected == 1) {
                rectangleArea();
            }
            if (optionSelected == 2) {
                circleArea();
            }
            if (optionSelected == 3) {
                cylinderVolume();
            }

            if (optionSelected == -1)
                run = false;
            /* Statement showing error message if user enter invalid option */
            if (optionSelected >= 4 || optionSelected <= -2){
                System.out.println();
                System.out.println("Error! Please insert a valid option.");
                System.out.println();
            }
        }
    }

    /* Method to calculate the area of the rectangle */
    public static void rectangleArea(){

        /* Declaring Variables */
        double length,width,area;

        /* Reads user input */
        System.out.println("Enter the length of the rectangle: ");
        length = input.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        width = input.nextDouble();

        /* Calculation */
        area = length * width;

        /* Output result */
        System.out.println();
        System.out.println("The area of the rectangle is " + area);
        System.out.println();
    }

    /* Method to find the area of a circle */
    public static void circleArea(){

        /* Declaring Variables */
        double radius,area;

        /* User input */
        System.out.println("Enter the radius of the circle: ");
        radius = input.nextDouble();

        /* Calculation - Formula */
        area = Math.PI * (Math.pow(radius,2));

        /* Output result */
        System.out.println();
        System.out.printf("The area of the circle is %.2f%n" , area);
        System.out.println();
    }

    /* Method to find the volume of a cylinder */
    public static void cylinderVolume(){

        /* Declaring Variables */
        double volume, radius, height;

        /* User input */
        System.out.println("Insert the radius of the cylinder: ");
        radius = input.nextDouble();
        System.out.println("Insert the height of the cylinder: ");
        height = input.nextDouble();

        /* Calculation - volume = πr2h */
        volume = Math.PI * (Math.pow(radius,2) * height);

        /* Output result */
        System.out.println();
        System.out.printf("The volume of the cylinder is %.4f%n", volume);
        System.out.println();
    }
}
