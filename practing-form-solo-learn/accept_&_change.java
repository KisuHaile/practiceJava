import java.util.Scanner;

class name {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in); 
        
        System.out.println("Enter your name");
        String name = user.nextLine(); 
        
        System.out.println("Would you want to change your name? \n 1. yes \n 2. No");
        int input = user.nextInt(); 
        
        switch (input) {
            case 1:
                
                user.nextLine(); 
                System.out.println("Enter your new name");
                name = user.nextLine(); 
                System.out.println("Your new name is: " + name);
                break;
            case 2:
                System.out.println("Your name remains: " + name);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        
        user.close();
    }
}
