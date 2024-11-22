import java.util.Scanner;

public class Input2{

    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        int num1 = num.nextInt();
        int num2 = num.nextInt();

        
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("The exchange number for number one is " + num1);
        System.out.println("The exchange number for number two is " + num2);

        num.close();
    }
}
*/