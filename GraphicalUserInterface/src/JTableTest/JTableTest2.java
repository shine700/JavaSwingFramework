package JTableTest;

import javax.swing.*;

public class JTableTest2 extends JFrame {

    public JTableTest2(){
        String data[][] = {{"101", "A", "670000"},
                {"102", "B", "550000"},
                {"103", "C", "440000"}};
        String column[] = {"ID", "Name", "Salary"};

        JTable table = new JTable(data, column);
        //   specific column resizables
        table.getColumnModel().getColumn(0).setResizable(true);
        table.setEnabled(false);
        table.setBounds(30, 40, 200, 300);

        //  add it to the JFrame
        //  and add table to the JScrollPane
        JScrollPane sp = new JScrollPane(table);


        add(sp);
        setSize(400, 400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        new JTableTest2();
    }
}
