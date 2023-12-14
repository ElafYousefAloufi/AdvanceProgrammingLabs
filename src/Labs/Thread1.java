/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: VBR 
 * Lab Activity #05
 */
package Labs;

import java.util.logging.Level;
import java.util.logging.Logger;

// Create a thread by extending Thread class
public class Thread1 extends Thread //(1)
{

    String s = null;

    Thread1(String s1) {

        //(2) 
        s = s1;
        //(3) 
        start();
    }

    @Override
    public void run()//(4)
    {

        // (5)  
        for (int i = 0; i < 5; i++) {
            System.out.println(s);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Exception");
            }
        }

    }

}
