package JTableTest;
import javax.swing.JTable;
import javax.swing.JFrame;
public class JTableTest extends JFrame{

    String data[][] = {{"101", "Shahin", "10000"},
                    {"102", "Sudipto", "20000"},
                    {"103", "Ruhi", "30000"}};
    String column[] = {"ID", "Name", "Serial"};

    JTable table;

    public JTableTest(){
        table = new JTable(data, column);
        table.setBounds(50, 50, 200, 300);
        table.setCellSelectionEnabled(false);
        

        add(table);
    }

    public static void main(String[] args){
        JTableTest tableFrame = new JTableTest();
        tableFrame.setSize(300, 400);
        tableFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tableFrame.setLocationRelativeTo(null);
        tableFrame.setVisible(true);
    }
}
