package OOP.question3;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("12345",2000);
        CheckingAccount checkingAccount = new CheckingAccount("12345",2000);
        savingsAccount.withdraw(120);
        savingsAccount.deductTax();
        checkingAccount.withdraw(10000);

    }
}
