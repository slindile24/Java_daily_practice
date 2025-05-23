package Scanner_Practice.question2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number:");
            int first_number = scanner.nextInt();
            System.out.println("Enter second number:");
            int second_number = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Choose operation(+,-,*,/): ");
            String operation = scanner.nextLine();
            try{
                if (second_number == 0){
                    System.out.println("Cannot divide by 0");
                }
                switch(operation){
                    case "+":
                        System.out.println(first_number + second_number);
                        break;
                    case "-":
                        System.out.println(first_number - second_number);
                        break;
                    case "*":
                        System.out.println(first_number * second_number);
                        break;
                    case "/":
                        System.out.println(first_number / second_number);
                        break;
                }
            }catch (ArithmeticException e){
                System.out.println("Undefined");
            }
        }catch (InputMismatchException e){
            System.out.println("Enter a valid number!");

        }
    }
}
