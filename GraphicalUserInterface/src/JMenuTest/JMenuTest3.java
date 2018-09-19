package JMenuTest;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.event.*;

public class JMenuTest3 extends JFrame {

    JMenuBar menuBar;
    JMenu menu1, menu2, menu3, menu4;
    JMenuItem item1, item2, item3, item4;

    public JMenuTest3(){
        menuBar = new JMenuBar();

        menu1 = new JMenu("File");
        menu2 = new JMenu("Entry");
        menu3 = new JMenu("Help");
        menu4 = new JMenu("Quit");

        item1 = new JMenuItem("Exit");
        item2 = new JMenuItem("New");
        item3 = new JMenuItem("Open");
        item4 = new JMenuItem("About");

        //  set shortcut key
        item1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
//        item1.setIcon(new ImageIcon(getClass().getResource()))

        menu1.add(item1);
        menu1.add(item3);

        menu2.add(item2);
        menu2.add(menu3);

        menu3.add(item4);

        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        menuBar.add(menu4);

        setJMenuBar(menuBar);

        item1.addActionListener((ActionListener) this);
        item2.addActionListener((ActionListener) this);
        menu4.addActionListener((ActionListener) this);

        menu4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                super.mouseClicked(mouseEvent);
                if(mouseEvent.getSource() == menu4){
                    int x = JOptionPane.showConfirmDialog(rootPane, "Are you sure.?", "Confirm", JOptionPane.OK_CANCEL_OPTION);
                    System.out.println(x);
                    System.exit(0);
                }

            }
        });


        /****   item1   ***/
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(actionEvent.getSource() == item1){
                    int x = JOptionPane.showConfirmDialog(rootPane, "Are you sure", "Confirm", JOptionPane.OK_CANCEL_OPTION);
                    if(x == 0){
                        System.out.println(x);
                        System.exit(0);
                    } else{

                    }
                }

                if(actionEvent.getSource() == item2){
                    JMenuTest2 menuTest2 = new JMenuTest2();
                    menuTest2.setVisible(true);
                }
            }
        });
    }

    public static void main(String[] args){
        JMenuTest3 jm = new JMenuTest3();
        jm.setVisible(true);
    }
}
