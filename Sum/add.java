package Sum;
import java.util.Scanner;

class In {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers: ");

        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int O = M++ + N + ++M;
        
        System.out.println("The value: " + O);
        
        scanner.close();
    }
}
