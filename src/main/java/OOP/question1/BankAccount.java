package OOP.question1;

public class BankAccount {
    private String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
    }

}
