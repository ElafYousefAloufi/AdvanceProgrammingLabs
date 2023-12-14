/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: VBR 
 * Quiz1
 */

package Labs;
import javax.swing.JOptionPane;

public class Quiz1 {

    public static void main(String[] args) {

        String s = "Welcome To CPIT 305 Labs";
        JOptionPane j = new JOptionPane();

        try {

            for (int i = 0; i <= 30; i++) {

                System.out.println(s.charAt(i));

            }

        } catch (StringIndexOutOfBoundsException o) {

            System.out.println("\nException Class: " + o.getClass().getName() + "\n" + "Error Message: " + o.getMessage());

        } finally {

            j.showMessageDialog(null, "Good Luck");
        }
    }
}
