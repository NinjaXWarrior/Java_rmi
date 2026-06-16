import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseCalc extends JFrame implements MouseListener {
    JTextField t1, t2;
    JLabel lblResult;

    public MouseCalc() {
        setSize(250, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        lblResult = new JLabel("Result will show here");

        add(new JLabel("Num 1:")); add(t1);
        add(new JLabel("Num 2:")); add(t2);
        add(lblResult);

        // Listen for mouse actions on the entire window frame
        addMouseListener(this);

        setVisible(true);
    }

    // Triggered when mouse is pressed down
    public void mousePressed(MouseEvent e) {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        lblResult.setText("Sum (Pressed): " + (n1 + n2));
    }

    // Triggered when mouse is released
    public void mouseReleased(MouseEvent e) {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        lblResult.setText("Difference (Released): " + (n1 - n2));
    }

    // Must include empty declarations for remaining interface methods to compile
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseCalc();
    }
}