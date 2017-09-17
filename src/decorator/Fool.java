package decorator;

/**
 * @author Khalid Elshafie
 * @created 9/17/17
 */
public class Fool extends SandwichDecorator {

    public Fool(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double getCost() {
        return super.getCost() + 3;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Fool";
    }
}
