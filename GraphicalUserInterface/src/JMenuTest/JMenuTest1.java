package JMenuTest;
import javax.swing.*;
import java.awt.*;

public class JMenuTest1 extends JFrame {
    private JMenu menu;
    private JMenu submenu;
    private JMenuBar menuBar;
    private JMenuItem menuItem1;
    private JMenuItem menuItem2;
    private JMenuItem menuItem3;
    private JMenuItem menuItem4;
    private JMenuItem menuItem5;

    public JMenuTest1(){
        setLayout(new FlowLayout());
        menuBar = new JMenuBar();   //  menu bar
        menu = new JMenu("Menu");   //  menu
        submenu = new JMenu("Sub Menu");    //  sub-menu

        menuItem1 = new JMenuItem("Menu Item 1");
        menuItem2 = new JMenuItem("Menu Item 2");
        menuItem3 = new JMenuItem("Menu Item 3");
        menuItem4 = new JMenuItem("Menu Item 4");
        menuItem5 = new JMenuItem("Menu Item 5");

        //  menu item added to the menu
        menu.add(menuItem1);
        menu.add(menuItem2);

        //  menu added the sub menu ( menu -> submenu  )
        menu.add(submenu);

        //  menu item added to sub menu ( subMenu -> menuItem )
        submenu.add(menuItem3);
        submenu.add(menuItem4);
        submenu.add(menuItem5);

        //  menu added to menu bar ( menuBar -> menu )
        menuBar.add(menu);

        //  add the menu bar on the frame
        setJMenuBar(menuBar);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JMenuTest1 menuTestFrame = new JMenuTest1();
                menuTestFrame.setSize(500, 500);
                menuTestFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menuTestFrame.setLocationRelativeTo(null);
                menuTestFrame.setVisible(true);
            }
        });

    }
}
