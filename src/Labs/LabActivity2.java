/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: VBR 
 * Lab Activity #02
 */
package Labs;

import javax.swing.JOptionPane;

public class LabActivity2 {

    public static void main(String[] args) {

        //create object 
        JOptionPane j = new JOptionPane();

        //try block (the code)
        try {

            String number = j.showInputDialog("Enter number to power it: ");
            int num = Integer.parseInt(number);
            j.showMessageDialog(null, "The result of power " + num + " is: " + square(num));

            //catch blocks (handeling the exceptions)
            //exception of non acceptable format of numbers 
        } catch (NumberFormatException n) {

            j.showMessageDialog(null, "Exception Class: " + n.getClass().getName() + "\n" + n.getMessage());

            //exception of number out of the range (0-100) 
        } catch (OutOfRangeException r) {

            j.showMessageDialog(null, "Exception Class: " + r.getClass().getName() + "\n" + r.getMessage());

            //finally block will excecute anyway 
        } finally {

              System.out.println("**This is a fially block**");

        }
    }

    //method that square number and checks if the number is in the range (0-100)
    static int square(int num) throws OutOfRangeException {
        if (num < 0 || num > 100) {

            //throw an out of range exception 
            throw new OutOfRangeException("Error: The number " + num + " is out of the range: (0 to 100)");
        }

        return num * num;
    }
}
