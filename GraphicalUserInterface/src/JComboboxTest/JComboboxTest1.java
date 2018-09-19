package JComboboxTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class JComboboxTest1 extends JFrame {
    JComboBox comboBox;

    public JComboboxTest1(){
        setLayout(new FlowLayout());
        String[] country = {"Bangladesh", "Australia", "England", "America", "Island"};

//        Vector<String> vectorString = new Vector<String>(2);
//        vectorString.addElement("Banladesh");
//        vectorString.addElement("Australia");
//        vectorString.addElement("England");
//        vectorString.addElement("America");
//        vectorString.addElement("Icland");

        comboBox = new JComboBox(country);
        comboBox.setBounds(100, 100, 150, 50);
        comboBox.setEditable(false);

        add(comboBox);
    }

    public static void main(String[] args){
        JComboboxTest1 comboboxFrame = new JComboboxTest1();
        comboboxFrame.setSize(300, 300);
        comboboxFrame.setLocationRelativeTo(null);
        comboboxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        comboboxFrame.setVisible(true);
    }
}
