import java.util.Scanner;

public class OverloadingDemo {

    public static void main(String[] args) {

        /* New Scanner Object */
        Scanner input = new Scanner(System.in);

        /* Declaring Variables */
        int integerNumber;
        double doubleNumber;

        /* Reading user input */
        System.out.println("Enter a integer value: ");
        integerNumber = input.nextInt();

        /* Output result */
        System.out.println("The square of " + integerNumber + " is " + MyMath.square(integerNumber));

        /* Reading user input */
        System.out.println(""); //Blank line, style purpose.
        System.out.println("Enter a double value: ");
        doubleNumber = input.nextDouble();

        /* Output result */
        System.out.println("The square of " + doubleNumber + " is " + MyMath.square(doubleNumber));
    }
}
