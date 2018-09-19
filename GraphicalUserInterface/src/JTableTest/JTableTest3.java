package JTableTest;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.util.Scanner;

public class JTableTest3 extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;

    private String name;
    private String city;
    private String salary;

    public JTableTest3(String name, String city, String salary){
        super("Demo table retrive data from user");
        this.name = name;
        this.city = city;
        this.salary = salary;

        table = new JTable();

        tableModel = new DefaultTableModel();
        table.setModel(tableModel);

        tableModel.addColumn("Name");
        tableModel.addColumn("City");
        tableModel.addColumn("Salary");

        tableModel.addRow(new Object[]{name, city, salary});



        add(table);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = in.nextLine();

        System.out.print("Enter city : ");
        String city = in.nextLine();

        System.out.print("Enter salary : ");
        String salary = in.nextLine();

        new JTableTest3(name, city, salary);
    }
}
