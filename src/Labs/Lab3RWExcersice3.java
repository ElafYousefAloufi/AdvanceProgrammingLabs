/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: VBR 
 * Lab Activity #03
 */

package Labs;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author ASUS
 */
public class Lab3RWExcersice3 {

    public static void main(String[] args) throws IOException {
        RandomAccessFile output = null;
        output = new RandomAccessFile("lab3.txt", "rw");
        try {

            output.seek(1000);
            System.out.println("Boolean is: " + output.readBoolean());
            System.out.println("Double is: " + output.readDouble());
            System.out.println("Int is: " + output.readInt());
            System.out.println("String is: " + output.readUTF());
            
            output.seek(10000);
            System.out.println("Position 10000 reading is: " + output.readUTF());
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }

}
