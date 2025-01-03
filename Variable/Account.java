
import java.util.Scanner;



public class Account {

    private int accountNumber;
    private double balance;

    Account(int num, double balnce){
        this.accountNumber = num;

        if (balnce < 0){
            System.err.println("Balamce can not be Zero. ");
        }
        else{
            this.balance = balnce;
        }
        
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Account number ");
        int accountNumber = input.nextInt();
        
        System.out.println("Balance ");
        double balance = input.nextDouble();

        input.close();
    }
}
