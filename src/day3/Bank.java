package day3;

public class Bank {

    public static void main (String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();

        //a1.accountHolderName = "Aditya";
        a1.setAccountHolderName("Aditya");
        //a1.accountNumber = 123456;
        a1.setAccountNumber("12345");
        //a1.accountBalance = 13000;
        a1.deposit(a1, 1000);

        //a2.accountHolderName = "Sireej";
        a2.setAccountHolderName("Sireej");
        //a2.accountNumber = 12346;
        a2.setAccountNumber("12346");
        //a2.accountBalance = 500;
        a2.deposit(a2, 200);

        System.out.println(a1.getAccountBalance());
        System.out.println(a2.getAccountBalance());

        //Transfer balance 200 from a1 to a2
//        a1.setAccountBalance(13000-200);
//        a2.setAccountBalance(500+200);

        a1.transferBalance(a1,a2,1000);
        System.out.println(a1.getAccountBalance());
        System.out.println(a2.getAccountBalance());

    }
}
