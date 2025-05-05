package OOP.question3;

public abstract class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    void deposit(double amount){
        if (amount> 0){
            balance += amount;
        }else{
            System.out.println("Cannot add amount to balance");
        }
    }

    abstract void withdraw(double amount);


    void displayInfo(){
        System.out.println("Balance: " + balance);
        System.out.println("AccountNumber: "+ accountNumber);
    }
}
