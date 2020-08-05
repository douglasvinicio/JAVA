import java.util.Scanner;

public class MetricDemo {

    public static void main(String[] args) {

        /* Variables Declaration */
        double miles, kilos;

        /* New Scanner object */
        Scanner input = new Scanner(System.in);

        /* Reads user input for miles */
        System.out.println("Enter a distance in miles: ");
        miles = input.nextDouble();

        kilos = Metric.milesToKilometers(miles); //Method called inside Metric.java

        /* Output the result of the equation */
        System.out.printf("%.2f miles equals %.2f kilometers.\n", miles , kilos);

        /* Reads user input for Kilometers */
        System.out.println("Enter a distance in Kilometers: ");
        kilos = input.nextDouble();

        miles = Metric.kilometersToMiles(kilos); // Method invoked from Metric.java

        /* Output the result */
        System.out.printf("%.2f Kilometers equals %.2f Miles.\n", kilos, miles);
    }
}
