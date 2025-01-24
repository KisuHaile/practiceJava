import javax.swing.JOptionPane;

public class OptionPaneExample {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Welcome to Java Programming!", "Message", JOptionPane.INFORMATION_MESSAGE);

        
        String name = JOptionPane.showInputDialog(null, "What is your name?", "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        
        int choice = JOptionPane.showConfirmDialog(null, "Do you like programming, " + name + "?", "Confirmation", JOptionPane.YES_NO_OPTION);

        
        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "That's great, " + name + "!", "Response", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Oh no, " + name + "! Maybe you'll like it soon.", "Response", JOptionPane.WARNING_MESSAGE);
        }
    }
}
