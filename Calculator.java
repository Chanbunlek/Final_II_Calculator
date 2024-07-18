import javax.swing.*;
import java.awt.*;

public class Calculator {
    private static void onCalculat(JTextField firstField, JTextField secondField, JTextField resultField, char operator) {
        double num1 = Double.parseDouble(firstField.getText());
        double num2 = Double.parseDouble(secondField.getText());
        double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
        }
        resultField.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(6, 2));

            JTextField firstNumberField = new JTextField();
            JTextField secondNumberField = new JTextField();
            JTextField resultField = new JTextField();
            resultField.setEditable(false);

            JButton addButton = new JButton("+");
            JButton subtractButton = new JButton("-");
            JButton multiplyButton = new JButton("*");
            JButton divideButton = new JButton("/");
            JButton modulusButton = new JButton("%");
            JButton clearButton = new JButton("Clear");

            addButton.addActionListener(e -> onCalculat(firstNumberField, secondNumberField, resultField, '+'));
            subtractButton.addActionListener(e -> onCalculat(firstNumberField, secondNumberField, resultField, '-'));
            multiplyButton.addActionListener(e -> onCalculat(firstNumberField, secondNumberField, resultField, '*'));
            divideButton.addActionListener(e -> onCalculat(firstNumberField, secondNumberField, resultField, '/'));
            modulusButton.addActionListener(e -> onCalculat(firstNumberField, secondNumberField, resultField, '%'));
            clearButton.addActionListener(e -> {
                firstNumberField.setText("");
                secondNumberField.setText("");
                resultField.setText("");
            });

            panel.add(new JLabel("First number  :"));
            panel.add(firstNumberField);
            panel.add(new JLabel("Second number :"));
            panel.add(secondNumberField);
            panel.add(new JLabel("Result        :"));
            panel.add(resultField);
            panel.add(addButton);
            panel.add(subtractButton);
            panel.add(multiplyButton);
            panel.add(divideButton);
            panel.add(modulusButton);
            panel.add(clearButton);

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}