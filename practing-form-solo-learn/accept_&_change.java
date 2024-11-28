import java.util.Scanner;

class name {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in); // Only one Scanner object needed

        // Get user's name
        System.out.println("Enter your name");
        String name = user.nextLine(); // Correct method name

        // Ask if user wants to change their name
        System.out.println("Would you want to change your name? \n 1. yes \n 2. No");
        int input = user.nextInt(); // Reuse the same Scanner for integer input

        // Handle the user choice with a switch statement
        switch (input) {
            case 1:
                // Ask for a new name if user wants to change it
                user.nextLine(); // Consume the newline character left by nextInt()
                System.out.println("Enter your new name");
                name = user.nextLine(); // Update the name
                break;
            case 2:
                // No change in name, proceed with the old one
                System.out.println("Your name remains: " + name);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        // Print the new name
        System.out.println("Your new name is: " + name);

        // Close the Scanner
        user.close();
    }
}
