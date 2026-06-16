import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorForm extends JFrame implements ActionListener {
    JButton btnRed, btnBlue, btnGreen;

    public ColorForm() {
        setSize(300, 150);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btnRed = new JButton("RED");
        btnBlue = new JButton("BLUE");
        btnGreen = new JButton("GREEN");

        add(btnRed); add(btnBlue); add(btnGreen);

        btnRed.addActionListener(this);
        btnBlue.addActionListener(this);
        btnGreen.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRed) {
            btnRed.setBackground(Color.RED);
        } else if (e.getSource() == btnBlue) {
            btnBlue.setBackground(Color.BLUE);
        } else if (e.getSource() == btnGreen) {
            btnGreen.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new ColorForm();
    }
}