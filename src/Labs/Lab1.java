/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: VBR 
 * Lab Activity #01
 */
package Labs;

public class Lab1 {

    public static void main(String[] args) {
        //(1)
        try {
            System.out.println(args[0]);

          //(2)
        } catch (ArrayIndexOutOfBoundsException ex) {
            //System.out.println(ex.getMessage());
            System.out.println("***ArrayIndexOutOfBoundsException***");

          //Executed even though error exist 
          //eg. close in files 
          //(3)
        } finally {
            System.out.println("Executed Sucessfully");
        }
    }
}
