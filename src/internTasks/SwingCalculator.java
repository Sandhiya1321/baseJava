package internTasks;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCalculator extends JFrame implements ActionListener {
    private JTextField display;
    private String currentInput = "";
    private String operator = "";
    private double firstNumber = 0;

    public SwingCalculator() {
        setTitle("Swing Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String value = e.getActionCommand();

        if ("0123456789".contains(value)) {
            currentInput += value;
            display.setText(currentInput);
        } else if ("+-*/".contains(value)) {
            firstNumber = Double.parseDouble(currentInput);
            operator = value;
            currentInput = "";
        } else if ("=".equals(value)) {
            double secondNumber = Double.parseDouble(currentInput);
            double result = switch (operator) {
                case "+" -> firstNumber + secondNumber;
                case "-" -> firstNumber - secondNumber;
                case "*" -> firstNumber * secondNumber;
                case "/" -> firstNumber / secondNumber;
                default -> 0;
            };
            display.setText(String.valueOf(result));
            currentInput = "";
        } else if ("C".equals(value)) {
            currentInput = "";
            display.setText("");
        }
    }

    public static void main(String[] args) {
        new SwingCalculator();
    }
}