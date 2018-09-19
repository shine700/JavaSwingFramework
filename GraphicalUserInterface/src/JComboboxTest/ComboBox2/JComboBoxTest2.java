package JComboboxTest.ComboBox2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class JComboBoxTest2 extends JFrame {

    JLabel label;

    public JComboBoxTest2(){
        setLayout(new FlowLayout());

        //  creating vector and addElement in the vector
        Vector<String> vectorString = new Vector<String>();
        vectorString.addElement(new Country("Bangladesh").toString());
        vectorString.addElement(new Country("Australia").toString());
        vectorString.addElement(new Country("England").toString());
        vectorString.addElement(new Country("America").toString());
        vectorString.addElement(new Country("Island").toString());

        //  Error -> must working in Custom ComboBox model
//        MyComboBoxModel m = new MyComboBoxModel(vectorString);
        DefaultComboBoxModel model = new DefaultComboBoxModel(vectorString);
        //  add the model to the comboBox
        JComboBox<String> countryComboBox = new JComboBox<String>(model);
        countryComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> combo = (JComboBox<String>) e.getSource();
                String data = (String) combo.getSelectedItem();

//                DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>) combo.getModel();
//
//                int selectedIntex = model.getIndexOf(data);
//                if(selectedIntex < 0){
//                    //  if the selected book does not exist before,
//                    //  add it into this combo box
//                    model.addElement(data);
//                }
                JOptionPane.showMessageDialog(null, data);
            }
        });


        countryComboBox.setEditable(false);

        add(countryComboBox);

    }

    public static void main(String[] args){
        JComboBoxTest2 comboBoxFrame = new JComboBoxTest2();
        comboBoxFrame.setSize(300, 300);
        comboBoxFrame.setLocationRelativeTo(null);
        comboBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        comboBoxFrame.setVisible(true);
    }
}
