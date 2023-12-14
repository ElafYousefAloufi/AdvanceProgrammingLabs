/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: VBR 
 * Lab Activity #01
 */

package Labs;
import javax.swing.JOptionPane;

public class LabActivity1 {

    public static void main(String[] args) {
        JOptionPane j = new JOptionPane();

        try {

            String number = j.showInputDialog("Enter number to power it");
            int num = Integer.parseInt(number);
            j.showMessageDialog(null, "The result of power " + num + " is: " + square(num));

        } catch (NumberFormatException e) {

            j.showMessageDialog(null, e.getMessage());

        } finally {

            System.out.println("**This is a fially block**");

        }
    }

    static int square(int num) {
        return num * num;
    }
}
