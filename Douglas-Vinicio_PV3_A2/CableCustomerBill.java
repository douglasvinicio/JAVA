import java.util.Scanner;

public class CableCustomerBill {

    /* New scanner object */
    static Scanner input = new Scanner(System.in);

    /* Declaring Const Variables */
    /* For Residential Customers */
    static final double R_BILL_PROC_FEE = 4.50;
    static final double R_BASIC_SERV_COST = 20.50;
    static final double R_COST_PREM_CHANNEL = 20.50;
    /* For Business Customers */
    static final double B_BILL_PROC_FEE= 15.00;
    static final double B_BASIC_SERV_COST = 75.00;
    static final double B_BASIC_CONN_COST = 5.00;
    static final double B_COST_PREM_CHANNEL = 50.00;

    /* Main method */
    public static void main(String[] args){

        /* Declaring variables */
        int accountNumber; //Stores the account number of the client
        char customerType; //Customer type (Residential or Business) declared as char to store A/a or B/b
        int noOfPremChannels; //Number of premium channels
        int noOfBasicServConn; //Number of basic service connections that the user subscribes
        double amountDue; //Amount due by the client
        double additionalConnections; //Stores the number of additional connections for business type customers
        boolean run = true; //Variable to control the while loop

        while (run) {
            System.out.println();
            System.out.println("This program computes a cable bill.");
            /* Reads user input */
            System.out.println("Enter the account number: ");
            accountNumber = input.nextInt(); //Account number input
            System.out.println("Enter the customer type: R or r (Residential), B or b (Business): ");
            customerType = input.next().trim().charAt(0); //Customer type input (trim to remove any white spaces).

            /* If Condition to residential customers */
            if (customerType == 'r' || customerType == 'R'){

                /* Asks the user how many premium channels */
                System.out.println("Enter the number of premium channels: ");
                noOfPremChannels = input.nextInt(); //Number of Premium Channels

                /* Formula for Residential Customers */
                amountDue = R_BILL_PROC_FEE + R_BASIC_SERV_COST + noOfPremChannels * R_COST_PREM_CHANNEL;

                /* Output the result */
                System.out.println("Account number: " + accountNumber);
                System.out.printf("Amount due: $%.2f%n" , amountDue);
            }

            /* If Condition to business customers */
            else if (customerType == 'b' || customerType == 'B'){
                System.out.println("Enter the number of basic service connections: ");
                noOfBasicServConn = input.nextInt(); //Number of basic Services Connection

                System.out.println("Enter the number of premium channels: ");
                noOfPremChannels = input.nextInt(); //Number of Premium Channels for business users

                if (noOfBasicServConn <= 10) {
                    amountDue = B_BILL_PROC_FEE + B_BASIC_SERV_COST + noOfPremChannels * B_COST_PREM_CHANNEL; }

                else {
                    /* Formula for more than 10 connections */
                    additionalConnections = (noOfBasicServConn - 10) * B_BASIC_CONN_COST; //Calculating fees for basic connections that exceeds 10 connections and storing value inside the variable.
                    amountDue = additionalConnections + B_BILL_PROC_FEE + B_BASIC_SERV_COST + noOfPremChannels * B_COST_PREM_CHANNEL ;
                }

                /* Output the result */
                System.out.println("Account number: " + accountNumber);
                System.out.printf("Amount due: $%.2f%n" , amountDue);
            }

            else {
                System.out.println("The type of client entered are not valid! Please try again. ");
            }
        }
    }
}

/* Main algorithm
1. Prompt the user to enter the account number.
2. Prompt the user to enter the type of account (Residential or Business).
3. If the user chooses business prompt the number of service connections.
4. Prompt the user to enter the number of premium channels.
5. Calculate the amount due by the clients based on the info entered.
    5.1 - Multiply the number of premium channels by the value of the premium channel.
    5.2 - Sum the premium channels multiplication with the basic processing fee and the basic service cost.
    5.3 - If business selected add 5.00 for each additional connection after 10 connections.
6. Store the result.
7. Output the account number.
8. Output the amount due.
*/
