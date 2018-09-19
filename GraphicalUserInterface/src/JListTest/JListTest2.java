package JListTest;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class JListTest2 extends JFrame {
    /*****
     * list is a single dimension array
     *
     *****/
    private JList list;

    String[] listColorNames = {"Black", "Blue", "Green", "Yellow",
        "White"};

    Color[] listColorValues = {Color.BLACK, Color.BLUE, Color.GREEN,
        Color.YELLOW, Color.WHITE};
    Container contentPane;

    public JListTest2(){
        super("List source demo");
        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        list = new JList(listColorNames);
        list.setSelectedIndex(1);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        contentPane.add(new JScrollPane(list));

        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                contentPane.setBackground(listColorValues[list.getSelectedIndex()]);
            }
        });

        add(list);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        new JListTest2();
    }
}
