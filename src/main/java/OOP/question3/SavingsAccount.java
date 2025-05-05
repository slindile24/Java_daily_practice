package OOP.question3;

public class SavingsAccount extends BankAccount implements Taxable{
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount <1000){
            System.out.println("Transaction unsuccessful.Balance cannot be below 1000");
        }else{
            System.out.println("Transaction successful.");
        }
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public void deductTax(){
        double tax = balance * 0.05;
        balance -= tax;
    }
}
