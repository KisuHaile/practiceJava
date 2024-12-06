import java.util.Scanner;

public class calculate{
    static void Addition(int[] numbers) {   
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("The sum is: " + sum);
    }

    static void Subtraction(int[] numbers) {
        int diff = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            diff -= numbers[i];
        }
        System.out.println("The result of subtraction is: " + diff);
    }

    static void Multiplication(int[] numbers) {
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        System.out.println("The product is: " + product);
    }

    static void Division(int[] numbers) {
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                System.out.println("Error: Division by zero!");
                return;
            }
            result /= numbers[i];
        }
        System.out.println("The result of division is: " + result);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter how many numbers you want to calculate: ");
        int howMany = input.nextInt();

        // Array to store the numbers from the user
        int[] numbers = new int[howMany];

        // Input numbers from the user
        for (int i = 0; i < howMany; i++) {
            System.out.println("Insert number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Choose operation
        System.out.println("Insert a number for: \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        int choice = input.nextInt();

        // Perform chosen operation
        switch (choice) {
            case 1:
                Addition(numbers);
                break;
            case 2:
                Subtraction(numbers);
                break;
            case 3:
                Multiplication(numbers);
                break;
            case 4:
                Division(numbers);
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }

        input.close();
    }
}
