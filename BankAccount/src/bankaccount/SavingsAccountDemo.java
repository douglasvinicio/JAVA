package bankaccount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SavingsAccountDemo {

    public static void main(String[] args) {

        //New Scanner object to read user input
        Scanner input = new Scanner(System.in);

        double startingBalance = 0;
        double annualInterest = 0;

        System.out.println("Enter your starting balance: ");
        startingBalance = input.nextDouble();
        System.out.println("Enter the annual interest in percentage % : ");
        annualInterest = input.nextDouble();

        // New SavingAccounts object
        SavingsAccount myAccount = new SavingsAccount(startingBalance, annualInterest);

        // Variables
        double amount;
        //Looping control
        boolean run = true;
        //Option Selected - to select each option will be run inside the loop
        int optionSelected;

        /* Loop through the account */
        while (run) {
            System.out.println("------------------------------");
            System.out.println("Lets operate your bank account!");
            System.out.println("------------------------------");
            System.out.println(
                    "Select one of the following options: \n"
                    + "1 - Account Info \n"
                    + "2 - Deposit \n"
                    + "3 - Withdraw \n"
                    + "4 - Deposits.txt file \n"
                    + "5 - Withdraws.txt file\n"
                    + "6 - Monthly Process Fees \n"
                    + "7 - Calculate Interests Gains \n"
                    + "0 - Exit the application");

            optionSelected = input.nextInt();
            //Account info
            if (optionSelected == 1) {
                System.out.println(myAccount);
            } //Deposit
            else if (optionSelected == 2) {
                System.out.println("Insert the amount of your deposit: ");
                amount = input.nextDouble();
                myAccount.deposit(amount);
                System.out.println(myAccount);
                System.out.println("*** Deposits Total: " + myAccount.getDepositsTotal() + " ***");
            } //Withdraw
            else if (optionSelected == 3) {
                System.out.println("Insert how much you want to withdraw: ");
                amount = input.nextDouble();
                myAccount.withdraw(amount);
                System.out.println(myAccount);
                System.out.println("*** Total number of withdraws: " + myAccount.getWithdrawsTotal() + " ***");
            } //Deposits.txt
            else if (optionSelected == 4) {
                try {
                    File deposits = new File("Deposits.txt");
                    Scanner readDeposits = new Scanner(deposits);
                    System.out.println("SUCCESS - The file 'Deposits.txt' was found.");
                    //Reading through each line inside the file and invoking deposit method
                    while (readDeposits.hasNext()) {
                        myAccount.deposit(readDeposits.nextDouble());
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("ERROR - The file 'Deposits.txt' was NOT found." + e.getMessage());
                }
            } //Withdraws.txt
            else if (optionSelected == 5) {
                try {
                    File withdraws = new File("Withdraws.txt");
                    Scanner readWithdraws = new Scanner(withdraws);
                    System.out.println("SUCCESS - The file 'Withdraws.txt' was found.");
                    //Reading through each line inside the file and invoking withdraw method
                    while (readWithdraws.hasNext()) {
                        myAccount.withdraw(readWithdraws.nextDouble());
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("ERROR - The file 'Withdraws.txt' was NOT found." + e.getMessage());
                }
            } // Monthly Process Fees
            else if (optionSelected == 6) {
                System.out.println("Processing monthly fees...");
                myAccount.monthlyProcess();
                System.out.println(myAccount);
            } // Calculate Gains Interest
            else if (optionSelected == 7) {
                System.out.println("Calculating Interests...");
                myAccount.calcInterest();
                System.out.println(myAccount);
            } //Exit loop
            else if (optionSelected == 0) {
                run = false;
            }

        }
    }
}
