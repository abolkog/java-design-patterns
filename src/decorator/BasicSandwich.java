package decorator;

/**
 * Concrete Implemenation of the Interface
 * @author Khalid Elshafie
 * @created 9/17/17
 */
public class BasicSandwich implements Sandwich{

    @Override
    public double getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Bread";
    }
}
