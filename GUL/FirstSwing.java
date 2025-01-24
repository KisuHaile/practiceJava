import javax.swing.*;

public class FirstSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("First Swing App");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setLayout(null); 

        JFrame text = new JFrame("Second Swing App");

        
        JButton button = new JButton("Click Me");
        button.setBounds(130, 100, 100, 40); 
        frame.add(button);
        frame.setVisible(true);
    
    }
}
