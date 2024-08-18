import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a color");

        label = new JLabel("");
        label.setBackground(Color.WHITE);
        label.setOpaque(true);


        this.pack();
        this.setVisible(true);
    }




    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
