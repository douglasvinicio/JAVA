import java.util.Scanner;

public class InvestmentCalculator {

    /* New Scanner Object */
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        /* Declaring Variables to store values */
        double futureValue; //FV - Future Value. Initial Investment + gains
        double presentValue; //PV - Present Value of deposit. Initial Investment
        double annualRate;
        int numberOfYears;
        double R;

        /* Initializing Phase - Reads user input */
        System.out.println();// Blank line
        System.out.println("Enter how much you want to invest: ");
        presentValue = input.nextDouble(); //Present Value
        System.out.println("Enter the annual rate (Ex: 0.5%, 1%, 2%) :");
        annualRate = input.nextDouble(); //Annual Rate
        annualRate = annualRate/100; //Dividing annualRate input number to 100 to transform to a decimal.
        System.out.println("For how many years?");
        numberOfYears = input.nextInt(); //Number of Years

        /* Output Message - Design Purpose */
        System.out.printf("%s%20s%n" , "Year" , "Amount on Deposit");
        System.out.printf("%s%20s%n", "====" , "==================");

        /* Formula -  fv = pv (1 + r)Math.pow n */
        /* Processing Phase -  For loop and calculation */
        for (int year = 1; year <= numberOfYears; year++){ //Create variable year to control the loop
            futureValue = presentValue * (Math.pow(1 + annualRate , year)); // Formula to perform calculation;
            System.out.printf("%4d%,20.2f%n", year , futureValue); //Output value result to the user
            if (year == numberOfYears){
                System.out.printf("%nYou invested $%.2f with an interest rate of %.2f%% " +
                        "and after %d years your profit will be $%.2f",
                        presentValue, annualRate * 100, numberOfYears, futureValue - presentValue);
                System.out.println();
            }
        }

    }
}
