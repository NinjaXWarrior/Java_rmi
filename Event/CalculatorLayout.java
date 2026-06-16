import javax.swing.*;
import java.awt.*;

public class CalculatorLayout {
    public static void main(String[] args) {
        // 1. Create the main window frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(350, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use BorderLayout for the main window structure
        frame.setLayout(new BorderLayout(10, 10));

        // 2. Create the Display Screen (Top)
        JTextField screen = new JTextField("0");
        screen.setFont(new Font("Arial", Font.BOLD, 28));
        screen.setHorizontalAlignment(JTextField.RIGHT); // Align text to the right side
        screen.setEditable(false); // Prevent keyboard typing directly into it

        // Add the screen to the top (NORTH) of our window
        frame.add(screen, BorderLayout.NORTH);

        // 3. Create the Button Panel (Center Grid)
        // A 4x4 layout grid for our 16 standard calculator keys
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));

        // Array containing all button labels in order
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        // Loop through the array, create each button, and add it to the grid panel
        for (String label : buttons) {
            JButton btn = new JButton(label);
            btn.setFont(new Font("Arial", Font.BOLD, 20));
            buttonPanel.add(btn);
        }

        // Add the grid panel to the middle (CENTER) of our window
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Make the window appear
        frame.setVisible(true);
    }
}