/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labs;

/**
 *
 * @author ASUS
 */
public class mythread implements Runnable {

    Thread t;

    mythread() {
        t = new Thread(this, "My thread");
        t.start();
       
    }

    public static void main(String[] args) throws InterruptedException {
        new mythread();
    }

    @Override
    public void run() {
        try{
            t.join();
            System.out.println(t.getName());
        }catch(Exception x){
            System.out.println("Exception");
        }
      
    }
}
