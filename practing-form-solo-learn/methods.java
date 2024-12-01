import java.util.Scanner;

class Method {
    static void log_in() {
        Scanner user1 = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = user1.nextLine();

        System.out.print("What is your PC name: ");
        String Pc_name = user1.nextLine();

        System.out.print("What is your PC serial number: ");
        String serial = user1.nextLine();

        System.out.print("What is your PC model: ");
        String pc_Model = user1.nextLine();

        System.out.print("What is your phone number: ");
        int phone_number = user1.nextInt();

        System.out.print("What is your ID: ");
        int pc_id = user1.nextInt();

        System.out.println("Your PC has been registered successfully!");
    }

    static void sign_in() {
        Scanner user2 = new Scanner(System.in);

        System.out.print("What is your ID number? ");
        int num = user2.nextInt();

        System.out.print("What is your PC serial number? ");
        int Pc_serial = user2.nextInt();
    }

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        while (true) {
            System.out.println("\nWhat do you want to do?\n1. Log in\n2. Sign in\n3. Exit");
            int choice = user.nextInt();

            if (choice == 1) {
                log_in();
            } else if (choice == 2) {
                sign_in();
            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("You have entered a wrong number. Please try again.");
            }
        }

        user.close();
    }
}
