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
    public void transferBalance(Account a1, Account a2, double amountToBeTransferred) {
        // transferring balance logic
        //TODO
        //Logic to check if balance is available
        a1.accountBalance -= amountToBeTransferred;   //accountBalance = accountBalance - amountToBeTransferred
        a2.accountBalance += amountToBeTransferred;   //accountBalance = accountBalance + amountToBeTransferred

    }


    public void deposit(Account a, double amountToBeDeposited){
        //Logic to check negative balance deposited
        a.accountBalance += amountToBeDeposited;
    }



}
