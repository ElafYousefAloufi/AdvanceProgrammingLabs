/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: VBR 
 * Lab Activity #10
 */
package Labs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Lab10 extends JFrame {

    public static int count = 1;

    public static void main(String[] args) {

        //define frame
        JFrame frame = new JFrame("Lab10");

        //define panel
        JPanel panel = new JPanel(); //default FlowLayout

        //change panel color 
        panel.setBackground(Color.white);

        //to change panel layout 
        //panel.setLayout(new GridLayout(3,1));
        //panel.setLayout(new GridLayout(2,2));
        
        //define GUI wedgets 
        // (1) Button 1
        ImageIcon pic1 = new ImageIcon("C:\\Users\\ASUS\\Desktop\\Lab10\\pic.jpg");
        JButton beep = new JButton(pic1);
        beep.setPreferredSize(new Dimension(110, 110));

        // (2) Label 
        JLabel label_1 = new JLabel("Pushes");

        // (3) Button 2 
        JButton done = new JButton("Done..");
        done.setVisible(false); //undisplayed 

        //add GUI wdgets to panel 
        panel.add(beep);
        panel.add(label_1);
        panel.add(done);

        //add GUI wdgets to pannel 
        frame.add(panel);

        //set the frame 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(fale);
        frame.setSize(250, 190);
        frame.setVisible(true);
        //frame.pack();
        frame.setLocationRelativeTo(null);

        //implements ActionListener 
        beep.addActionListener((ActionEvent e) -> {
            label_1.setText("Pushes " + count++);
            if (count > 10) {
                label_1.setVisible(false);
                done.setVisible(true);
                done.addActionListener(new Action());
            }
        });
    }

    static class Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
