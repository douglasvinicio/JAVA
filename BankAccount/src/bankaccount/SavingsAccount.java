package bankaccount;

public class SavingsAccount extends BankAccount {

    private boolean accountStatus;

    public SavingsAccount(double startingBalance, double annualInterest) {
        super(startingBalance, annualInterest);
        if (getAccountBalance() <= 25) {
            setAccountStatus(false);
        } else {
            setAccountStatus(true);
        }
    }

    @Override
    public void deposit(double depositAmount) {
        //Turning account status to true if the amount of deposit sets the balance to more than 25$
        if (getAccountBalance() + depositAmount > 25) {
            setAccountStatus(true);
        }
        super.deposit(depositAmount);
    }

    @Override
    public void withdraw(double withdrawAmount) {
        //Setting account status to false if a withdraw try is made and the account has less than 25$ of balance.
        if (getAccountBalance() <= 25.0) {
            setAccountStatus(false);
            System.out.println("No withdraws can be made. Your account status is inactive.");
        } // If the amount of withdraw will set the balance to less than 25, print the user to choose another amount.
        else if ((getAccountBalance() - withdrawAmount) < 25) {
            System.out.println("ERROR : Choose another amount of withdraw.");
        } else {
            super.withdraw(withdrawAmount);
        }
    }

    @Override
    public double monthlyProcess() {

        double serviceCharge = 0; //Holds the value of monthly charges
        int withdraws = getWithdrawsTotal(); // Number of withdraws made
        if (withdraws > 4) {
            serviceCharge = (withdraws - 4) * 1.0;
            setAccountBalance(getAccountBalance() - serviceCharge);
        }
        //Controlling status of the account according to the amount charged.
        if ((getAccountBalance() - serviceCharge) < 25) {
            setAccountStatus(false);
        } else {
            setAccountStatus(true);
        }
        super.monthlyProcess();
        return serviceCharge;
    }

    public void setAccountStatus(boolean status) {
        accountStatus = status;
    }

    public String getAccountStatus() {
        String status;
        if (accountStatus) {
            status = "Active";
        } else {
            status = "Inactive - Balance less then $25. PS: No withdraws authorized.";
        }
        return status;
    }

    @Override
    public String toString() {
        return String.format("--------------------\n Bank Account Info\n--------------------\n"
                + "Account Balance : %.2f \n"
                + "Account Monthly Interest Earned: %.2f \n"
                + "Account Status: %s",
                 getAccountBalance(), getMonthlyInterest(), getAccountStatus());
    }
}
