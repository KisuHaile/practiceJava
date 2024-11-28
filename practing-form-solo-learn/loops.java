import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        
        Scanner choise = new Scanner(System.in);
        int in = 0;  

        // Use a while loop to keep asking the user until they make a valid choice
        while (in != 1 && in != 2) {
            
            System.out.print("What do you want? \n" + 
                             "1. Enter my name \n" + 
                             "2. Change my name \n");

            in = choise.nextInt(); 
            choise.nextLine(); // Consume the leftover newline character

            if (in != 1 && in != 2) {
                System.out.println("Invalid choice. Try again.");
            }
        }

        String name = "";  // Initialize the name variable

        switch (in) {
            case 1:
                System.out.print("Enter your name: ");
                name = choise.nextLine();
                System.out.println("My name is " + name);
                break;
            case 2:
                System.out.print("What will be your new name? ");
                name = choise.nextLine(); 
                System.out.println("Your new name is " + name);
                break;
        }

        choise.close();
    }
}
