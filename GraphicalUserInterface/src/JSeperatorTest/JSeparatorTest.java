package JSeperatorTest;

import javax.swing.*;
import java.awt.*;

public class JSeparatorTest extends JFrame {

    private JMenu menu;
    private JMenu subMenu;
    private JMenuBar menuBar;

    private JMenuItem item1;
    private JMenuItem item2;
    private JMenuItem item3;
    private JMenuItem item4;

    public JSeparatorTest(){
        //  menu items
        item1 = new JMenuItem("Menu item 1");
        item1 = new JMenuItem("Menu item 2");
        item1 = new JMenuItem("Menu item 3");
        item1 = new JMenuItem("Menu item 4");

        menu = new JMenu("Menu");
        menu.add(item1);
        //  add separator in the menu
        menu.addSeparator();
        menu.add(item2);
        menu.addSeparator();    //  add separator in the menu
        subMenu = new JMenu("Sub menu");
        subMenu.add(item3);
        subMenu.addSeparator(); //  add separator in the menu
        subMenu.add(item3);

        menu.add(subMenu);
        menuBar.add(menu);

        //  set the menu bar
        setJMenuBar(menuBar);
        add(menuBar);
    }

    public static void main(String[] args){
        JSeparatorTest separatorFrame = new JSeparatorTest();
        separatorFrame.setSize(300, 300);
        separatorFrame.setLocationRelativeTo(null);
        separatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        separatorFrame.setVisible(true);
    }
}
