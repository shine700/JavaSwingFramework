package JRadioButtonTest.JRadioButtonTest2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButtonTest2 extends JFrame {

    private JRadioButton linuxRadio;
    private JRadioButton windowsRadio;
    private JRadioButton macRadio;

    private ButtonGroup buttonGroup;

    private JButton button;
    private JLabel labelImg;

    private ImageIcon linuxIcon;
    private ImageIcon windowsIcon;
    private ImageIcon macIcon;

    public JRadioButtonTest2(){
        super("JRadioButton");
        setLayout(new GridLayout());

        linuxRadio = new JRadioButton("Linux");
        windowsRadio = new JRadioButton("Windows");
        macRadio = new JRadioButton("Macintosh");

        labelImg = new JLabel();
        button = new JButton("OK");

        buttonGroup = new ButtonGroup();
        buttonGroup.add(linuxRadio);
        buttonGroup.add(windowsRadio);
        buttonGroup.add(macRadio);

        //  getClass().getResource() -> go to the class package
        linuxIcon = new ImageIcon(getClass().getResource("\\pic\\linux.jpg"));
        windowsIcon = new ImageIcon(getClass().getResource("\\pic\\windows.jpg"));
        macIcon = new ImageIcon(getClass().getResource("\\pic\\mac.jpg"));

        linuxRadio.setSelected(true);
        labelImg.setIcon(linuxIcon);

        add(linuxRadio);
        add(windowsRadio);
        add(macRadio);

        add(labelImg);
        add(button);

        //  custom radio button action listener
        RadioButtonActionListener radioButtonActionListener = new RadioButtonActionListener();
        linuxRadio.addActionListener(radioButtonActionListener);
        windowsRadio.addActionListener(radioButtonActionListener);
        macRadio.addActionListener(radioButtonActionListener);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedOption = "";
                if(linuxRadio.isSelected()){
                    selectedOption = "Linux";
                } else if(windowsRadio.isSelected()){
                    selectedOption = "Windows";
                } else {
                    selectedOption = "Macintosh";
                }
                JOptionPane.showMessageDialog(null,
                        selectedOption);
            }
        });

        pack();
    }

    class RadioButtonActionListener implements ActionListener {

        public void actionPerformed(ActionEvent event){
            JRadioButton button = (JRadioButton) event.getSource();

            if(button == linuxRadio){
                labelImg.setIcon(linuxIcon);
            } else if(button == windowsRadio){
                labelImg.setIcon(windowsIcon);
            } else if(button == macRadio){
                labelImg.setIcon(macIcon);
            }
        }

    }

    public static void main(String[] args){
        JRadioButtonTest2 radioButtonFrame = new JRadioButtonTest2();
        radioButtonFrame.setSize(200, 200);
        radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        radioButtonFrame.setLocationRelativeTo(null);
        radioButtonFrame.setVisible(true);
    }
}