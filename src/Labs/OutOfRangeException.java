/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: VBR 
 * Lab Activity #02
 */

package Labs;

public class OutOfRangeException extends Exception {
    
    //empty constructor
    public OutOfRangeException() {
        super();
    }
    
    //string constructor that contain the error message
    public OutOfRangeException(String message) {
        super(message);
    }
}
