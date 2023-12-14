/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: VBR 
 * Lab Activity #03
 */

package Labs;

import java.io.*;
import javax.swing.*;

public class Person implements Serializable {

    private static final long serialVersionUID= 50;
      
    String name;
    String address;
    String phone;


    Person(String n, String a, String p) {
        this.name = n;
        this.address = a;
        this.phone = p;

    }

    public void printPersonInfo() {

        System.out.println("Name: " + name + "\nAddress: " + address + "\nPhone: " + phone);

    }

}
