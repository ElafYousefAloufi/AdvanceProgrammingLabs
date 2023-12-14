package Labs;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practice {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\ASUS\\Desktop\\305Labs\\employee.txt");
        FileWriter fw = new FileWriter("new.txt");
        int c = 0;
        System.out.println("My file separator is: " + File.separator);
        while (fr.ready()) {
            c = fr.read();
            System.out.print((char) c);

        }
        fw.write("Elaf ");
        int n = 65;
//        fw.write(Integer.toString(n));
        fw.write(n+ "");

        fr.close();
         fw.close();
    }
}
