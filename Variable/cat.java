import java.util.Scanner;

public class cat {
    String name;
    int age;

    cat() {
        name = "unknown";
        age = 5;
    }
    public static void main(String[] args) {

        Scanner User = new Scanner(System.in);
        cat animal = new cat();

        System.out.println("What is your cat's name: ");
        String name = User.nextLine();

        System.out.println("What is youe Age: ");
        int age = User.nextInt();

        System.out.println("Cat's name: " + animal.name);
        System.out.println("Cat's age: " + animal.age);
        
        User.close();
    }
}
