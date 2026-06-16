import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiniCalc extends JFrame implements ActionListener {
    JTextField txtNum1, txtNum2, txtResult;
    JButton btnAdd, btnSub, btnMul, btnDiv;

    public MiniCalc() {
        setTitle("Calculator");
        setSize(250, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        txtNum1 = new JTextField(15);
        txtNum2 = new JTextField(15);
        txtResult = new JTextField(15);
        txtResult.setEditable(false);

        btnAdd = new JButton("Add");
        btnSub = new JButton("Subtract");
        btnMul = new JButton("Multiply");
        btnDiv = new JButton("Divide");

        add(new JLabel("Num 1:")); add(txtNum1);
        add(new JLabel("Num 2:")); add(txtNum2);
        add(new JLabel("Result:")); add(txtResult);
        add(btnAdd); add(btnSub); add(btnMul); add(btnDiv);

        // Register ActionListeners
        btnAdd.addActionListener(this);
        btnSub.addActionListener(this);
        btnMul.addActionListener(this);
        btnDiv.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double n1 = Double.parseDouble(txtNum1.getText());
        double n2 = Double.parseDouble(txtNum2.getText());
        double res = 0;

        if (e.getSource() == btnAdd) res = n1 + n2;
        else if (e.getSource() == btnSub) res = n1 - n2;
        else if (e.getSource() == btnMul) res = n1 * n2;
        else if (e.getSource() == btnDiv) res = n1 / n2;

        txtResult.setText(String.valueOf(res));
    }

    public static void main(String[] args) {
        new MiniCalc();
    }
}