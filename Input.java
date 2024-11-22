import java.util.Scanner;

public class Input{
     public static void main(String[] args) {
         Scanner number = new Scanner(System.in);
         System.out.print("Enter two numbers: ");

         int num1 = number.nextInt();
         int num2 = number.nextInt();

        
         int num3 = num1;
         num1 = num2;
         num2 = num3;

         System.out.println("The first number is now: " + num1);
         System.out.println("The second number is now: " + num2);
         
       
         number.close();
     }
}
