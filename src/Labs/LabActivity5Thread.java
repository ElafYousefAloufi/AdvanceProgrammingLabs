/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: VBR 
 * Lab Activity #05
 */
package Labs;

import java.util.logging.Logger;

public class LabActivity5Thread implements Runnable {

    Thread t;
    String s;

    LabActivity5Thread(String s1) {

        t = new Thread(this);
        t.setName(s1);
        t.start();
    }

    @Override
    public void run()//(5)
    {

        try {
            int i = 0;
            for (i = 0; i < 3; i++) {
                // Thread.currentThread()
                System.out.print("Thread: " + Thread.currentThread().getName());
                System.out.println(" Iteration: " + i);
                Thread.sleep(1000);
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(ex.getMessage());
        }

    }
}
