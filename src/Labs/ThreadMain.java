/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: VBR 
 * Lab Activity #05
 */
package Labs;

public class ThreadMain {

    public static void main(String[] args) throws InterruptedException {
        Thread2 t1 = new Thread2("Thread2 (a)");

        System.out.println(t1.t.isAlive());
        //Thread1 t3= new Thread1("test");
        //thread2 will not excecute until thread1 finish its excecutin
        t1.t.join();
        System.out.println(t1.t.isAlive());
        Thread2 t2 = new Thread2("Thread2 (b)");

    }
}
