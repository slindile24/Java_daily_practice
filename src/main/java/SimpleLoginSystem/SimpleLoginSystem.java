package SimpleLoginSystem;
import java.util.Scanner;

public class SimpleLoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String EnteredUsername = scanner.nextLine();
        System.out.println("Enter your password: ");
        String EnteredPassword = scanner.nextLine();
        String correctUsername = "Slindile";
        String correctPassword = "Slishh";

        if(correctPassword.equals(EnteredPassword) && correctUsername.equals(EnteredUsername)){
            System.out.println("Access granted.");
        }else{
            System.out.println("Access denied.");
        }

    }
}
