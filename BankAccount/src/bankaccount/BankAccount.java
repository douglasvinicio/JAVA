package bankaccount;

public abstract class BankAccount {

    //Declaring variables
    private double annualInterestRate;
    public double monthlyServiceCharges;
    private double accountBalance;
    private int depositsTotal;
    private int withdrawsTotal;
    private double monthlyInterest;

    //Constructor accepting arguments for starting balance and annual interest
    public BankAccount(double startingBalance, double annualInterest) {
        this.accountBalance = startingBalance;
        this.annualInterestRate = annualInterest / 100;
    }

    public void deposit(double depositAmount) {
        setAccountBalance(accountBalance + depositAmount);
        setDepositsTotal(depositsTotal + 1);
    }

    public void withdraw(double withdrawAmount) {
        accountBalance = accountBalance - withdrawAmount;
        setAccountBalance(accountBalance);
        setWithdrawsTotal(withdrawsTotal + 1);
    }

    public double calcInterest() {
        double monthlyInterestRate = (annualInterestRate / 12);
        monthlyInterest = accountBalance * monthlyInterestRate;
        setAccountBalance(accountBalance + monthlyInterest);

        return monthlyInterest;
    }

    public double monthlyProcess() {
        setAccountBalance(accountBalance - monthlyServiceCharges);
        setDepositsTotal(0);
        setWithdrawsTotal(0);
        setMonthlyServiceCharges(0);
        return monthlyServiceCharges;
    }

    /* Setters and Getters */
    //Account Balance
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    //Annual Interest Rate
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    //Total of deposits
    public void setDepositsTotal(int depositsTotal) {
        this.depositsTotal = depositsTotal;
    }

    public int getDepositsTotal() {
        return depositsTotal;
    }

    //Monthly Service Charges
    public void setMonthlyServiceCharges(double monthlyServiceCharges) {
        this.monthlyServiceCharges = monthlyServiceCharges;
    }

    public double getMonthlyServiceCharges() {
        return monthlyServiceCharges;
    }

    //Total of withdraws
    public void setWithdrawsTotal(int withdrawsTotal) {
        this.withdrawsTotal = withdrawsTotal;
    }

    public int getWithdrawsTotal() {
        return withdrawsTotal;
    }

    //Monthly Interest value made
    public double getMonthlyInterest() {
        return monthlyInterest;
    }
}
