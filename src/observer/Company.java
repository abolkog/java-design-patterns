package observer;

/**
 * @author Khalid Elshafie
 * @created 9/14/17
 */
public class Company implements Observer {

    private String name;
    private String address;

    public Company(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public void update(String message) {
        System.out.printf("Company %s Got new notification: %s%n", this.name, message);
    }
}
