package GUL;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class labelexample {
    public static void main(String args[]) {
        // Create a new JFrame
        JFrame f = new JFrame("Label Example");

        // Create JLabel objects
        JLabel L1, L2;
        L1 = new JLabel("First label");
        L1.setBounds(50, 50, 100, 30);
        L2 = new JLabel("Second label");
        L2.setBounds(150, 50, 100, 30);

        // Add labels to the frame
        f.add(L1);
        f.add(L2);

        // Set frame properties
        f.setSize(400, 200); // Set frame size
        f.setLayout(null);   // Disable default layout for absolute positioning
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application on exit
        f.setVisible(true); // Make the frame visible
    }
}
