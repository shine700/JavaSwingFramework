package JLabelTest;

import javax.swing.*;
import java.awt.*;

import static sun.applet.AppletResourceLoader.getImage;

public class JLabelTest extends JFrame{

    private final JLabel text;
    private final JLabel iconLabel;
    private final JLabel textAndIcon;

    public JLabelTest(){
        super("JLabel");
        setLayout(new FlowLayout());    //  set Frame layout

        text = new JLabel("Label with Text");
        text.setToolTipText("This is Label with text");
        add(text);
        //  code not worked
        String filePath = "\"C:\\\\Users\\\\shine.DESKTOP-5IIPKLB\\\\IdeaProjects\\\\GraphicalUserInterface\\\\src\\\\Files\\\\kung_fu.jpg\"";
        Icon imageIcon = new ImageIcon(filePath);
        iconLabel = new JLabel("Label with text and icon", imageIcon ,SwingConstants.LEFT);
        iconLabel.setToolTipText("Image Icon");
        add(iconLabel);

        textAndIcon = new JLabel();
        textAndIcon.setText("Label with icon and text at bottom");
        textAndIcon.setIcon(imageIcon);
        textAndIcon.setHorizontalAlignment(SwingConstants.CENTER);
        textAndIcon.setVerticalAlignment(SwingConstants.BOTTOM);
        textAndIcon.setToolTipText("This is label 3");
        add(textAndIcon);
    }


    public static void main(String[] args){
        JLabelTest labelTest = new JLabelTest();
        labelTest.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        labelTest.setSize(500, 500);
        labelTest.setVisible(true);
    }
}
