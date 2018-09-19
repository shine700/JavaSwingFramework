package InputWithJOptionPane;

import javax.swing.JOptionPane;

public class InputWithJOpitonPane {
    public static void main(String[] args){

        String firstNumber = JOptionPane.showInputDialog("Enter your first number : ");
        String secondNumber = JOptionPane.showInputDialog("Enter your second number : ");

        int num1 = Integer.parseInt(firstNumber);
        int num2 = Integer.parseInt(secondNumber);

        int sum = num1 + num2;

        JOptionPane.showMessageDialog(null, "Sum = " +sum,
                "Addition of two numbers", JOptionPane.PLAIN_MESSAGE);

    }
}
