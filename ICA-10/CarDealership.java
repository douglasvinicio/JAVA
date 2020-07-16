import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CarDealership {

    /* Main method*/
    public static void main(String[] args) throws FileNotFoundException {

        /* Creating the file reader for mac */
        String desktop = System.getProperty ("user.home") + "/Desktop/";
        Scanner inFile = new Scanner(new FileReader(desktop + "carsSold.txt" ));

        int[] cars = new int[10]; //Store how many cars per salesperson
        String[] salesPerson = new String[10]; //Store the names of the salesperson
        int carsSoldTotal = 0; //Store the total numbers of cars sold
        int maxValue = cars[0]; //The maximum value inside the array cars
        int bestSalesPerson = 0; //Position inside the array

        for (int i = 0; i < cars.length ; i++){
            salesPerson[i] = inFile.next();
            cars[i] = inFile.nextInt();
            carsSoldTotal = cars[i] + carsSoldTotal;

            if(maxValue < cars[i])
            {
                maxValue = cars[i];
                bestSalesPerson = i;
            }

        }

        /* Output the result */
        System.out.printf("Name  \t Cars sold%n");
        System.out.println("---- \t ---------");
        System.out.printf("%s \t %d%n",salesPerson[0],cars[0]);
        System.out.printf("%s \t %d%n",salesPerson[1],cars[1]);
        System.out.printf("%s \t %d%n",salesPerson[2],cars[2]);
        System.out.printf("%s \t %d%n",salesPerson[3],cars[3]);
        System.out.printf("%s \t %d%n",salesPerson[4],cars[4]);
        System.out.printf("%s \t %d%n",salesPerson[5],cars[5]);
        System.out.printf("%s \t %d%n",salesPerson[6],cars[6]);
        System.out.printf("%s \t %d%n",salesPerson[7],cars[7]);
        System.out.printf("%s \t %d%n",salesPerson[8],cars[8]);
        System.out.printf("%s \t %d%n",salesPerson[9],cars[9]);
        System.out.println("The total of cars sold this month is " + carsSoldTotal);
        System.out.println("The best sales person is " + salesPerson[bestSalesPerson] + " with " + cars[bestSalesPerson] + " cars sold.");
    }
}

/*
ICA-2
--------
The management keeps the data in a file and assigns a
number, 1 to 10, to each salesperson.
The following statement declares an array, cars, of 10 components of type int to store the number of cars sold by each salesperson.

int[] cars = new int[10];

Write the code so that the number of cars sold by each salesperson is stored in the array
cars, output the total numbers of cars sold at the end of each month, and output the
salesperson number selling the maximum number of cars. (Assume that data is in the
file cars.txt and that this file has been opened using the Scanner object inFile.)
*/