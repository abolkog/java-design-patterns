package adapter;

/**
 * @author Khalid Elshafie <abolkog@gmail.com>
 * @created 27/02/2018.
 */

//Adaptee
public class Bicycle {

    public void pedal(){
        System.out.println("Bic starts to move");
    }

    public void stop() {
        System.out.println("Bic stopped");
    }

    public void ringBell() {
        System.out.println("Ring ring");
    }
}
