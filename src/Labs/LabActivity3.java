/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: VBR 
 * Lab Activity #03
 */

package Labs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class LabActivity3 {

    public static void main(String[] args) throws IOException {
        PrintWriter pw = null;
        BufferedReader br = null;
        StringBuilder sb = null;

        try {

            pw = new PrintWriter("Lab3.txt");
            br = new BufferedReader(new FileReader("Lab3.txt"));

            //(1) write
            pw.println("Elaf Yousef Aloufi");
            pw.println("Welcome to Lab class");
            pw.println("Feel Happy to do programming using java");
            pw.close();

            //(2) read char by char
            sb = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                int s = br.read();
                sb.append((char) s);
            }
            
            //(3) read the rest of lines 
            System.out.println(sb);
            while (br.ready()) {
                System.out.println(br.readLine());
            }

        } finally {
            
            //(4) close 
            if (pw != null) {
                pw.close();
            }
            if (br != null) {
                br.close();
            }
        }

    }
}
