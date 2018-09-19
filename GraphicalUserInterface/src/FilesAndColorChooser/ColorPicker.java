package FilesAndColorChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorPicker extends JFrame {

    public ColorPicker(){
        super("JColorChooser frame demo");
        setSize(400, 400);
        final Container contentPane = getContentPane();
        final JButton go  = new JButton("Show JColorChooser");
        go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Color c;
                c = JColorChooser.showDialog(getContentPane(), "Demo", Color.blue);
                contentPane.setBackground(c);
            }
        });
        contentPane.add(go, BorderLayout.SOUTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args){
        new ColorPicker();
    }
}
