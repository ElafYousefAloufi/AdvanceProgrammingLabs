/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: VBR 
 * Lab Activity #03
 */

package Labs;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab3RRExcersice2 {

    public static void main(String[] args) throws IOException {
        //randomly access the file not sequentially 
        RandomAccessFile input = null;
        RandomAccessFile output = null;
        String name = "Elaf Yousef Aloufi";
        boolean male = false;
        int year = 1431;
        double salary = 12345.32;

        try {

            input = new RandomAccessFile("lab3.txt", "rw");
            //point to the position 10000
            input.seek(1000);
            //check
            System.out.println("The pointer is in " + input.getFilePointer());

            //write
            //will write not understandable text in lab3 txt file 
            input.writeBoolean(male);
            input.writeDouble(salary);
            input.writeInt(year);
            input.writeUTF(name); //string 

            System.out.println("The new position of pointer is in " + input.getFilePointer() + "\n");

            output = new RandomAccessFile("lab3.txt", "rw");
            output.seek(1000);

            System.out.println("Boolean is: " + output.readBoolean());
            System.out.println("Double is: " + output.readDouble());
            System.out.println("Int is: " + output.readInt());
            System.out.println("String is: " + output.readUTF() + "\n");

            input.seek(10000);
            input.writeUTF(name);

            output.seek(10000);
            System.out.println("Position 10000 reading is: " + output.readUTF());

        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException");
      
        } finally {
            if (input != null) {
                input.close();

            }
            if (output != null) {
                output.close();
            }

        }
    }
}
