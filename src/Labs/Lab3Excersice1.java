/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: VBR 
 * Lab Activity #03
 */

package Labs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lab3Excersice1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //byte stream 
        FileInputStream input = null;
        FileOutputStream output = null;

        //initialization , checked exception 
        //(1) open
        input = new FileInputStream("first.txt");
        output = new FileOutputStream("second.txt"); //create file 

        try {

            int c;

            //(2) use
            //returns -1 
            while ((c = input.read()) != -1) {
                output.write(c);
            }

        } 
        
        //excecute anyway
        finally {
            if (input != null) {
                input.close();
            }

            if (output != null) {
                output.close();
            }

        }

    }
}
