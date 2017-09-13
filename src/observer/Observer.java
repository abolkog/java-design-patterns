package observer;

/**
 * Observer Interface
 * @author Khalid Elshafie
 * @created 9/13/17
 */
public interface Observer {

    /**
     * Update method: receives the notification from the subject
     * @param message
     */
    void update(String message);
}
