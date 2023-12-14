/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: VBR 
 * Lab Activity #03
 */
package Labs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        // (1) create an object from person class  
        Person person = new Person("Yazan", "Dammam", "0584766278");

       
        Person hanin = new Person("Hanin Qasim", "Jubail", "0503928857");
        Person doaa = new Person("Doaa Aloufi", "Riyadh", "0599372695");

        Person[] arrayOfPerson = new Person[3];
        arrayOfPerson[0] = new Person("Elaf Yousef", "Khobar", "0509117257");
        arrayOfPerson[1] = hanin;
        arrayOfPerson[2] = doaa;

        // (2) call write method to serialize object 
//        write(person);
        writeArray(arrayOfPerson);

        // (3) call read method to deserialize the object
//        read();
        readArray();

    }

    public static void write(Person person) throws IOException {
        FileOutputStream fos = new FileOutputStream("person.txt");
        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(person);
        person.printPersonInfo();
        System.out.println("Object has been serialize");
        System.out.println("-----------------------------");
    }

    public static void read() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("person.txt");
        ObjectInputStream in = new ObjectInputStream(fis);

        Person personNew = (Person) in.readObject();
        personNew.printPersonInfo();
        System.out.println("Object has been deserialize");

    }

    public static void writeArray(Person[] arrayOfPerson) throws IOException {

        FileOutputStream fos = new FileOutputStream("person.txt");
        ObjectOutputStream output = new ObjectOutputStream(fos);

        output.writeObject(arrayOfPerson);

        for (Person a : arrayOfPerson) {
            a.printPersonInfo();
            System.out.println("-----------------------------");
        }

        System.out.println("Object has been serialize");
        System.out.println("\n***************************************************************\n");
    }

    public static void readArray() throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("person.txt");
        ObjectInputStream input = new ObjectInputStream(fis);

        Person[] personNew = (Person[]) input.readObject();

        for (Person b : personNew) {
            b.printPersonInfo();
            System.out.println("-----------------------------");
        }

        System.out.println("Object has been deserialize");

    }
}
