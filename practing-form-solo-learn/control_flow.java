import java.util.Scanner; // Import the Scanner class for user input

// Class definition
class gs {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your grade to compare it:"); // Prompt user for input
        double grade = input.nextDouble(); // Read the grade as a double

        // Check the grade and determine the corresponding letter grade
        if (grade >= 90) {
            System.out.print("You got an A+");
        } else if (grade >= 85) {
            System.out.print("You got an A");
        } else if (grade >= 80) {
            System.out.print("You got an A-");
        } else if (grade >= 75) {
            System.out.print("You got a B+");
        } else if (grade >= 70) {
            System.out.print("You got a B");
        } else if (grade >= 65) {
            System.out.print("You got a B-");
        } else if (grade >= 60) {
            System.out.print("You got a C+");
        } else if (grade >= 50) {
            System.out.print("You got a C");
        } else if (grade >= 45) {
            System.out.print("You got a C-");
        } else if (grade >= 40) {
            System.out.print("You got a D");
        } else {
            System.out.print("You got an F"); // Grade is below 40
        }

        input.close(); // Close the Scanner to free resources
    }
}
