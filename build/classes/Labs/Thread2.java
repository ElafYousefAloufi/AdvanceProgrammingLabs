/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: VBR 
 * Lab Activity #05
 */
package Labs;

import java.util.logging.Logger;

// Create a thread by implementing Runnable interface
public class Thread2 implements Runnable// (1)
{

    //(2)
    Thread t;
    String s = null;

    Thread2(String s1) {

        s = s1;

        // (3)
        t = new Thread(this);

        // (4) 
        t.start();
    }

    @Override
    public void run()//(5)
    {

        try {
            int i = 0;
            for (i = 0; i < 5; i++) {
                System.out.println(s);
                Thread.sleep(1000);
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(ex.getMessage());
        }

    }
}
