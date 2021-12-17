package day3;

public class Account {

    //states - they want it to be private
    private String accountHolderName; //default null coz string
    private String accountNumber; // same as above
    private double accountBalance; //default is 0.0 coz double


    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    //behaviour
    public void transferBalance(Account a2, double amountToBeTransferred) {
        // transferring balance logic
        //TODO
        //Logic to check if balance is available
        if (accountBalance >= amountToBeTransferred) {
            this.accountBalance = this.accountBalance - amountToBeTransferred;   //accountBalance = accountBalance - amountToBeTransferred
            a2.accountBalance = a2.accountBalance + amountToBeTransferred;   //accountBalance = accountBalance + amountToBeTransferred
        }else{
            System.err.println("Insufficient Balance");
        }
    }


    public void deposit(double amountToBeDeposited){
        //Logic to check negative balance deposited
        if (amountToBeDeposited > 0) {
            this.accountBalance = this.accountBalance + amountToBeDeposited;
        }else{
            System.err.println("Deposit amount cannot be negative");
        }
    }



}
