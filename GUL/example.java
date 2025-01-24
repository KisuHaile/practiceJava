import javax.swing.*;

public class example {
    public static void main(String[] args) {
        JFrame frame = new JFrame("example");
        JTextField text = new JTextField();
        text.setBounds(100, 100, 200, 30);
        frame.add(text);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
