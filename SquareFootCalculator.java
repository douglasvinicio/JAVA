import java.util.Scanner;

public class SquareFootCalculator {

    /* New Scanner object */
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        /* Counter variable to control the for loop */
        int counter;

        /* Variable calculate the square feet of each user input */
        double sqrtCalculation;
        /* User input */
        int numberInput;
        /* Array of doubles to store the values calculated */
        double[] sqrtArray = new double[25];
        /* Array of ints to store values entered by the user */
        int[] arrayOfNumbers = new int[25];

        /* Output message asking user to enter a number */
        System.out.println("Please enter a number: ");


        /* For loop looping the size of the array / Calculates and store values */
        for(counter = 0; counter < sqrtArray.length; counter++){
            
            numberInput = input.nextInt(); // User input
            
            if (numberInput > 0){
            sqrtCalculation = Math.sqrt(numberInput); //Sqrt calculation
            sqrtArray[counter] = sqrtCalculation; //Stores sqrt calculation inside the array
            arrayOfNumbers[counter] = numberInput; //Stores number input inside array
            }
            else{
                counter--; //Subtract -1 from counter if a negative number is entered by the user.
            }
        }

        /* Output result for the user */
        System.out.println();
        System.out.println("Number \t Sqrt(Number)");
        System.out.println("----- \t  ---------");
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[0], sqrtArray[0]);
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[1], sqrtArray[1]);
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[2], sqrtArray[2]);
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[3], sqrtArray[3]);
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[4], sqrtArray[4]);
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[5], sqrtArray[5]);
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[6], sqrtArray[6]);
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[7], sqrtArray[7]);
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[8], sqrtArray[8]);
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[9], sqrtArray[9]);
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[10], sqrtArray[10]);
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[11], sqrtArray[11]);
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[12], sqrtArray[12]);
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[13], sqrtArray[13]);
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[14], sqrtArray[14]);
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[15], sqrtArray[15]);
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[16], sqrtArray[16]);
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[17], sqrtArray[17]);
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[18], sqrtArray[18]);
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[19], sqrtArray[19]);
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[20], sqrtArray[20]);
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[21], sqrtArray[21]);
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[22], sqrtArray[22]);
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[23], sqrtArray[23]);
        System.out.printf("%d\t%10.2f%n",arrayOfNumbers[24], sqrtArray[24]);
        System.out.println();
        System.out.println("The number of positive values entered is = " + counter);
        System.out.println();
    }
}
