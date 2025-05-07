package Scanner_Practice.question1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Even_Or_Odd {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            if (number % 2 == 0){
                System.out.println("This is an even number.");
            }else{
                System.out.println("This an odd number ");
            }
            scanner.close();

        } catch (InputMismatchException e) {
            System.out.println("Enter a valid integer!");;
        }


    }
}
