package OOP.question1;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("12345", 536.2);
        savingsAccount.deposit(200.1);
        savingsAccount.addInterest(10.0);
        System.out.println("Final balance: " + savingsAccount.getBalance());
    }



}


