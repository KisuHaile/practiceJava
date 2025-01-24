import java.util.Scanner;
import javax.swing.*;

public class userinputwithswing {
    public static void main(String[] args) {
        String x =JOptionPane.showInputDialog("Enter the Frist number");
        String y =JOptionPane.showInputDialog("Enter the Second number");
        
        int num1 = Integer.parseInt(x);
        int num2 = Integer.parseInt(y);
        
        int sum = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "The sum of " + num1 + " and " + num2 + " is " + sum);

    }
}
