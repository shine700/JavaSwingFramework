package JTableTest;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JTableTestWithListSelection extends JFrame{

    private String column[] = {"ID", "Name", "Salary"};
    private String data[][] = {{"101", "Shahin", "10000"},
            {"102", "Sudipto", "20000"},
            {"103", "Ruhi", "3000"}};

    public JTableTestWithListSelection(){
        JTable jTable = new JTable(data, column);
        jTable.setCellSelectionEnabled(true);


        ListSelectionModel selectionModel = jTable.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                String DATA = null;
                int[] rows = jTable.getSelectedRows();
                int[] columns = jTable.getSelectedColumns();

                for(int i=0; i<rows.length; i++){
                    for(int j=0; j<columns.length; j++){
                        DATA = (String) jTable.getValueAt(rows[i], columns[i]);
                    }
                }
                System.out.println("Table element selected is : " +DATA);
            }
        } );

        JScrollPane scrollPane = new JScrollPane(jTable);
        add(scrollPane);
        setSize(300, 200);
        setVisible(true);
    }


    public static void main(String[] args){
        new JTableTestWithListSelection();
    }
}
