/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: VBR 
 * Quiz1
 */
package Labs;

import javax.swing.JOptionPane;

public class q {

   public static void main(String[] args) {

        String s = "Welcome To CPIT 305 Labs";
        JOptionPane j = new JOptionPane();

        try {

            for (int i = 0; i <= 30; i++) {

                System.out.println(s.charAt(i));

            }

        
        } finally {

            j.showMessageDialog(null, "Good Luck");
        }
    }
}
