
import java.util.Scanner;
import java.util.InputMismatchException;

public class divisionwithexception{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result = num1 / num2;
            System.out.println("The result is: " + result);


        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter only numbers.");
        } catch (Exception e){
            System.out.println("An error occurred: " );
        }
        scanner.close();   
    }
}