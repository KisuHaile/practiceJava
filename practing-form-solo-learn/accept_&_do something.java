import java.util.Scanner; // Import the Scanner class for user input

// Class definition
class accept {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create a Scanner object to read user input

        // Prompt and read the user's ID number
        System.out.println("Enter your ID number");
        int num = input.nextInt(); // Read ID number as an integer

        // Prompt and read the user's name
        System.out.println("Enter your name");
        String name = input.next(); // Read name as a String

        // Prompt and read the user's father's name
        System.out.println("Enter your father name");
        String f_name = input.next(); // Read father's name as a String

        // Prompt and read the user's age
        System.out.println("Enter your age");
        int age = input.nextInt(); // Read age as an integer

        // Prompt and read the user's university
        System.out.println("Where do you learn");
        String uni = input.next(); // Read university name as a String

        // Prompt and read the user's grade
        System.out.println("Enter your grade");
        double grade = input.nextDouble(); // Read grade as a double

        // Prompt and read the current year
        System.out.println("Enter the current year");
        int c_year = input.nextInt(); // Read current year as an integer

        // Calculate the user's year of birth
        int born = c_year - age;

        // Display the collected information
        System.out.print("My ID number is " + num + " and my name is " + name + " " 
        + f_name + ". I am " + age + " years old. And I was born in " + born + 
        ". I learn in a university called " + uni + " and my grade is " + grade + ".");

        input.close(); // Close the Scanner to free resources
    }
}
