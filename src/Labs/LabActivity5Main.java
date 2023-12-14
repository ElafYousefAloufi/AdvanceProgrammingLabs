/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: VBR 
 * Lab Activity #05
 */
package Labs;

public class LabActivity5Main {

    public static void main(String[] args) throws InterruptedException {
        LabActivity5Thread thread1 = new LabActivity5Thread("One");
        System.out.println("Thread One is alive? " + thread1.t.isAlive());
        thread1.t.join();
        LabActivity5Thread thread2 = new LabActivity5Thread("Two");
        System.out.println("Thread Two is alive? " + thread2.t.isAlive());
        thread2.t.join();
        LabActivity5Thread thread3 = new LabActivity5Thread("Three");
        System.out.println("Thread Three is alive? " + thread3.t.isAlive());
        thread3.t.join();

        System.out.println("Thread One is alive? " + thread1.t.isAlive());
        System.out.println("Thread Two is alive? " + thread2.t.isAlive());
        System.out.println("Thread Three is alive? " + thread3.t.isAlive());

    }
}
