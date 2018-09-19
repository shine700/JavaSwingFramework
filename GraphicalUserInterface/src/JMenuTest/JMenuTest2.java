package JMenuTest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenuTest2 extends JFrame {

    private JMenuBar menuBar;

    private JMenu file;
    private JMenu edit;
    private JMenu help;

    //  file
    private JMenuItem newFile;
    private JMenuItem openFile;
    private JMenuItem save;
    private JMenuItem saveAs;
    private JMenuItem close;

    //  edit
    private JMenuItem cut;
    private JMenuItem copy;
    private JMenuItem paste;
    private JMenuItem selectAll;

    //  help
    private JMenuItem helpTo;

    private JTextArea textArea;

    public JMenuTest2(){
        textArea = new JTextArea();
        menuBar = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");

        //  menu items for File
        newFile = new JMenuItem("New");
        openFile = new JMenuItem("Open");
        save = new JMenuItem("Save");
        saveAs = new JMenuItem("Save as");
        close = new JMenuItem("Close");

        //  items added to the file menu
        file.add(newFile);
        file.add(openFile);
        file.add(save);
        file.add(saveAs);
        file.add(close);

        //  menu items for Edit
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        selectAll = new JMenuItem("Select all");

        //  items added to the Edit menu
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);

        cut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == cut){
                    textArea.cut();
                }
            }
        });

        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == copy){
                    textArea.copy();
                }
            }
        });

        paste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == paste){
                    textArea.paste();
                }
            }
        });

        selectAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == selectAll){
                    textArea.selectAll();
                }
            }
        });


        //  menu items for help
        helpTo = new JMenuItem("Help to");
        //  items added to the Help menu
        help.add(helpTo);

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);

        add(menuBar);
        setJMenuBar(menuBar);
        add(textArea);



    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JMenuTest2 menuTestFrame = new JMenuTest2();
                menuTestFrame.setSize(800, 500);
                menuTestFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menuTestFrame.setLocationRelativeTo(null);
                menuTestFrame.setVisible(true);
            }
        });
    }
}