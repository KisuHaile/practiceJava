import java.util.Scanner;

class dog {

    String name, color;

    dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("What is your dog's name: ");
        String name1 = input.nextLine();

        System.out.println("What is your dog's color: ");
        String color1 = input.nextLine();

        dog animal = new dog(name1, color1);

        System.out.println("Dog's name: " + animal.name);
        System.out.println("Dog's color: " + animal.color);

        input.close();
    }
}
