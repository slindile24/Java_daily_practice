package OOP.question3;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }
}
