package JRadioButtonTest;

import javax.swing.*;
import java.awt.*;

public class JRadioButtonTest1 extends JFrame {

    private JRadioButton radioButtonMale;
    private JRadioButton radioButtonFemale;

    public JRadioButtonTest1(){
        setLayout(new FlowLayout());
        radioButtonMale = new JRadioButton("Male");
        radioButtonFemale = new JRadioButton("Female");

        radioButtonMale.setBounds(75, 50, 100, 30);
        radioButtonFemale.setBounds(75, 100, 100, 30);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButtonMale);
        buttonGroup.add(radioButtonFemale);

        add(radioButtonMale);
        add(radioButtonFemale);

    }

    public static void main(String[] arsg){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JRadioButtonTest1 menuTestFrame = new JRadioButtonTest1();
                menuTestFrame.setSize(300, 300);
                menuTestFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menuTestFrame.setLocationRelativeTo(null);
                menuTestFrame.setVisible(true);
            }
        });
    }
}
