package Scanner_Practice.SumOfTwoNumbers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter second number: ");
            int secondNumber = scanner.nextInt();
            int result = firstNumber + secondNumber;
            System.out.println("Result is: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Enter a valid integer!");
        }
    }
}