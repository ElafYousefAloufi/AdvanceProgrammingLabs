/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: VBR 
 * Lab Activity #08
 */
package Labs;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class LabActivity8 {

    public static void main(String[] args) throws MalformedURLException, IOException {

        URL url = new URL("https://www.kau.edu.sa/Home.aspx");
        URLConnection connection = url.openConnection();
        connection.connect();
        System.out.println("URL Connection: ");
        System.out.println("Protocol is: " + url.getProtocol());
        System.out.println("Host is: " + url.getHost());
        System.out.println("Port is: " + url.getPort());
        System.out.println(url.getFile());
        PrintWriter printWriter = new PrintWriter("Lab8.txt");
        printWriter.write("URL Connection: ");
        printWriter.write("Protocol is: " + url.getProtocol());
        printWriter.write("Host is: " + url.getHost());
        printWriter.write("Port is: " + url.getPort());

        InputStream input = url.openStream();
        FileOutputStream output = new FileOutputStream("Lab8.txt");

        String line = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            printWriter.write(line);

        }
        printWriter.close();
    }

}
