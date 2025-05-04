package OOP.question1;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    void addInterest(double rate){
        balance = balance + (balance * rate);
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }
}
