package singleton;

/**
 * Driver class (Main)
 * Calls the test method
 * @author Khalid Elshafie
 * @created 9/10/17
 */
public class Driver {

    public static void main(String[] args) {

        //Test First Usage (Lazy Singleton)
        testLazySingleton();

        //Test Second Usage (Thread Safe)
        testThreadSafeSingleton();

    }

    /**
     * Test LazySingleton. create 2 instances and print out the letters
     */
    private static void testLazySingleton() {
        LazySingleton inst1 = LazySingleton.getInstance();
        LazySingleton inst2 = LazySingleton.getInstance();

        System.out.println(inst1.hashCode());
        inst1.printData();

        System.out.println(inst2.hashCode());
        inst2.printData();
    }


    private static void testThreadSafeSingleton() {
        new DataPrinter().start();

        new DataPrinter().start();

    }
}


/**
 * Dummy Thread that calls the getInstance and printData method
 */
class DataPrinter extends Thread {

    @Override
    public void run() {
        ThreadSafeSingleton.getInstance().printData();
    }
}
