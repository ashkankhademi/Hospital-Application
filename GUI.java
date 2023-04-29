import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        // Create the window
        JFrame frame = new JFrame("Basic GUI");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the components
        JPanel panel = new JPanel();

        // Create a label and add it to the panel
        JLabel label = new JLabel("Hello, World!");
        panel.add(label);

        // Create a button and add it to the panel
        JButton button = new JButton("Click me!");
        panel.add(button);

        // Add the panel to the window and show it
        frame.add(panel);
        frame.setVisible(true);
    }
}
