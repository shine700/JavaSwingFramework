package JButtonTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonTest extends JFrame{

    JButton textButton;
    JButton iconButton;
    JButton textWithIconButton;
    JButton actionButton;

    JButton button;

    //  Icon url
    String iconUrl = "C:\\Users\\shine.DESKTOP-5IIPKLB\\Desktop\\";

    public JButtonTest(){
        setLayout(new FlowLayout());

        //  Button with text
        textButton = new JButton("Show");
        textButton.setSize(50, 50);

        //  Button with icon
        iconButton = new JButton(new ImageIcon
                (iconUrl+"images.png"));
        iconButton.setSize(50, 50);


        //  Button with text and icon
        textWithIconButton = new JButton("Text with icon",
                new ImageIcon(iconUrl+"chat.png"));
        textWithIconButton.setBackground(Color.WHITE);


        //  Button with actionEvent
        actionButton = new JButton("Action Button");
        actionButton.setSize(100, 100);
        actionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "This is actionListener on a button");
            }
        });


        //  try all thing in one
        button = new JButton("Button", new ImageIcon(iconUrl+"chat.png"));
        button.setBackground(Color.WHITE);
        button.setForeground(Color.BLACK);
        button.setSize(100, 100);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog("Enter your name : ");
                String age = JOptionPane.showInputDialog("Enter your age : ");

                JOptionPane.showMessageDialog(null, "Name : "+name+ "\n" +
                        "Age : " +age);
            }
        });

        add(textButton);
        add(iconButton);
        add(textWithIconButton);
        add(actionButton);

        add(button);
    }

    public static void main(String[] args){
        JButtonTest buttonFrame = new JButtonTest();
        buttonFrame.setSize(400, 400);
        buttonFrame.setLocationRelativeTo(null);
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setVisible(true);
    }
}
