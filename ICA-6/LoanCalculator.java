import java.util.Scanner;

public class LoanCalculator {

    /* New Scanner Object */
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        /* 1 Phase - Defining variables types*/
        double loanAmount; // Loan Amount - User input
        double interestYear; //Interest per Year - User input
        double paymentPerMonth; // Value of monthly payment.
        double interestMonth; //Interest Rate per Month
        double interestPayment;
        double principal;

        int counter = 0;

        /* Reads and Stores users input */
        System.out.println("Enter the Loan Amount: ");
        loanAmount = input.nextDouble();
        System.out.println("Enter the Interest rate per year: ");
        interestYear = input.nextDouble();
        System.out.println("Enter how much you want to pay per month: ");
        paymentPerMonth = input.nextDouble();


        /* Initializing Interest Month - Divide the Interest rate per year to get the insterest rate per month */
        interestMonth = interestYear / 12;
        interestPayment = loanAmount * interestMonth / 100;

        if (paymentPerMonth < interestPayment){
            System.out.println("The payment per month it's too low and with this monthly payment" +
                    "the loan amount can't be repaid.");
        }else{
            /* While loop - Counter to measure how many months will take to finish the payment */
            while(counter <= loanAmount){
                principal = paymentPerMonth - interestPayment;
                loanAmount = loanAmount - principal;
                interestPayment = loanAmount * interestMonth / 100;
                counter++;
            }
            /* Output result to user */
            System.out.printf("It will take %d months to pay your loan." , counter);
            System.out.println();
        }
    }
}
