package JListTest;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.List;

public class JListTest extends JFrame {

    private JList<String> countryList;

    public JListTest(){
        setLayout(new FlowLayout());
        //  creating the model and add the element
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("USA");
        listModel.addElement("India");
        listModel.addElement("Vietnam");
        listModel.addElement("Canada");
        listModel.addElement("Denmark");
        listModel.addElement("France");
        listModel.addElement("Great Britain");
        listModel.addElement("Japan");

        //  creating the list
        countryList = new JList<>(listModel);
        countryList.setSize(200, 100);

        //  selection
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        //  add ListSelectionEvent in that
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(!e.getValueIsAdjusting()){
                    final List<String> selectedValueList = countryList.getSelectedValuesList();
                    System.out.println(selectedValueList);

                }
            }
        });

        //  adding JScrollPane in JList
        add(new JScrollPane(countryList));
        add(countryList);
    }


    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JListTest listFrame = new JListTest();
                listFrame.setSize(400, 400);
                listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                listFrame.setLocationRelativeTo(null);
                listFrame.setVisible(true);
            }
        });
    }
}
