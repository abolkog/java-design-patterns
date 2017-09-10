package singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Example of the using Singleton (LazySingleton Inititaliztion)
 * @author Khalid Elshafie
 * @created 9/10/17
 */
public class LazySingleton {

    /**
     * Array of Letters
     */
    private String[] LETTERS = { "a", "b", "c", "d", "e"};

    /**
     * List that holds the array of letter
     */
    private List<String> data = Arrays.asList(LETTERS);

    /**
     * Static instance of the class
     */
    private static LazySingleton instance;

    /**
     * Getterthod: Intiailize the instance if it was null and return it
     * @return instance of the class
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * Private Constructor
     * Shuffles the letters in the List
     */
    private LazySingleton() {
        Collections.shuffle(data);
    }

    /**
     * Loops throught the list and print the letter out
     */
    public void printData() {
        for(String item: data) {
            System.out.printf("%s ", item);
        }
        System.out.println();
    }

}
