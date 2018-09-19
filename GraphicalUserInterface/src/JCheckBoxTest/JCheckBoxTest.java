package JCheckBoxTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class JCheckBoxTest extends JFrame {

    JCheckBox checkBoxWithText;
    JCheckBox checkBoxWithImage;
    JCheckBox checkBoxWithDefaultValue;

    JCheckBox checkBox1;
    JCheckBox checkBox2;
    JCheckBox checkBox3;
    JCheckBox checkBox4;

    JButton button;

    String iconUrl = "C:\\Users\\shine.DESKTOP-5IIPKLB\\Desktop\\";

    public JCheckBoxTest(){

        setLayout(new FlowLayout());

        //  checkBox with text
        checkBoxWithText = new JCheckBox(" Remember Password");
        checkBoxWithText.setSize(100, 100);
//        checkBoxWithText.setPreferredSize(new Dimension(200, 100));
//        checkBoxWithText.setMaximumSize(new Dimension(300, 300));
        checkBoxWithText.setMargin(new Insets(50, 50, 50, 50));

        //  checkBox with icon
        checkBoxWithImage = new JCheckBox(new ImageIcon(iconUrl+"chat.png"));
        checkBoxWithImage.setBackground(Color.WHITE);
        checkBoxWithImage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "hello");
            }
        });

        //  checkBox with default selected
        checkBoxWithDefaultValue = new JCheckBox("Remember Password", true);

        //  checkBox with itemSelect event
        checkBox1 = new JCheckBox("Wordpress");
        checkBox2 = new JCheckBox("Java Enterprice");
        checkBox3 = new JCheckBox("Android");
        checkBox4 = new JCheckBox("Artificial Intelligence");
        button = new JButton("Show", new ImageIcon(iconUrl+"chat.png"));
        button.setBackground(Color.WHITE);
        button.setForeground(Color.WHITE);

            /*  For single event on an checkBox */
//        ItemListener itemListener = new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                JCheckBox check = (JCheckBox) e.getSource();
//                String name = check.getText();
//                JOptionPane.showMessageDialog(null, name);
//            }
//        };
//        checkBox1.addItemListener(itemListener);
//        checkBox2.addItemListener(itemListener);
//        checkBox3.addItemListener(itemListener);
//        checkBox4.addItemListener(itemListener);

        /*  Show all selected item with a button  */
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> msg = new ArrayList<String>();
                if(checkBox1.isSelected()){
                    msg.add(checkBox1.getText());
                } if(checkBox2.isSelected()){
                    msg.add(checkBox2.getText());
                } if(checkBox3.isSelected()){
                    msg.add(checkBox3.getText());
                } if(checkBox4.isSelected()){
                    msg.add(checkBox4.getText());
                }
                JOptionPane.showMessageDialog(null, msg);
            }
        });


        //  add to JFrame
        add(checkBoxWithText);
        add(checkBoxWithImage);
        add(checkBoxWithDefaultValue);
        add(checkBox1);
        add(checkBox2);
        add(checkBox3);
        add(checkBox4);
        add(button);
    }


    public static void main(String[] args){
        JCheckBoxTest checkBoxFrame = new JCheckBoxTest();
        checkBoxFrame.setSize(500, 500);
        checkBoxFrame.setLocationRelativeTo(null);
        checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        checkBoxFrame.setVisible(true);
    }
}
