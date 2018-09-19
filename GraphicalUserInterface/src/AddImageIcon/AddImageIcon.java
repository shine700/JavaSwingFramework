package AddImageIcon;

import javax.swing.*;
import java.awt.*;

public class AddImageIcon extends JFrame {

    private ImageIcon image1;
    private ImageIcon image2;
    private ImageIcon image3;

    private String path = "C:\\Users\\shine.DESKTOP-5IIPKLB\\Desktop\\";

    public AddImageIcon(){
        image1 = new ImageIcon(path+"img_1.png");
        image2 = new ImageIcon(path+"img_2.jpg");
        image3 = new ImageIcon(path+"img_3.png");

        setLayout(new GridLayout(1, 3, 5, 5));
        add(new JLabel(image1));
        add(new JLabel(image2));
        add(new JButton(image3));
    }

    public static void main(String[] args){

        AddImageIcon imageIcon = new AddImageIcon();
        imageIcon.setTitle("ImageIcon");
        imageIcon.setSize(500, 500);
        imageIcon.setLocationRelativeTo(null);
        imageIcon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        imageIcon.setVisible(true);
    }
}
