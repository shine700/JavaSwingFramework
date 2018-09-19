package JTextFieldTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JTextFieldAndPasswordField extends JFrame {
    protected final JTextField textField1;
    protected final JTextField textField2;
    protected final JTextField textField3;
    protected final JPasswordField passwordField;

    public JTextFieldAndPasswordField(){
        super("JTextField and PasswordField");
        setLayout(new FlowLayout());

        textField1 = new JTextField(10);
        add(textField1);

        textField2 = new JTextField("Enter your text here");
        add(textField2);

        textField3 = new JTextField("Uneditable text field", 21);
        textField3.setEditable(false);
        add(textField3);

        passwordField = new JPasswordField("Hiddend Text");
        add(passwordField);

        //  register the event handlers
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField3.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }

    private class TextFieldHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event){
            String string = "";

            //  user pressed Enter in JTextField textField1
            if(event.getSource() == textField1){
                string = String.format("textField1 : %s", event.getActionCommand());
            } else if(event.getSource() == textField2){
                string = String.format("textField2 : %s", event.getActionCommand());
            } else if(event.getSource() == textField3){
                string = String.format("textField3 : %s", event.getActionCommand());
            } else if(event.getSource() == passwordField){
                string = String.format("passwordField : %s", event.getActionCommand());
            }

            JOptionPane.showMessageDialog(null, string);
        }
    }

    public static void main(String[] args){
        JTextFieldAndPasswordField textAndPassword = new JTextFieldAndPasswordField();
        textAndPassword.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        textAndPassword.setSize(500, 500);
        textAndPassword.setVisible(true);
    }
}

