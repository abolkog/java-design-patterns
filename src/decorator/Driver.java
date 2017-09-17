package decorator;

/**
 * Main Class
 * @author Khalid Elshafie
 * @created 9/17/17
 */
public class Driver {

    public static void main(String[] args) {
        Sandwich basicSandwich = new Shatta(new Fool(new Salt(new BasicSandwich())));

        System.out.printf("Description: %s%n", basicSandwich.getDescription());
        System.out.printf("Cost: %.2f", basicSandwich.getCost());


        //
        /**
         * حاول تعلم المثال دة لو داير
         * Car Options System
         * Car: Interface
         * BasicCar: Concrete Implementaion
         * CarDecorator: Abstract Decorator
         * Options: Navigation system, DVD Player ... etc (Decoroate as you wish :D)
         * Use the form to discuss the code if you have any issues: http://javaway.abolkog.com
         */
    }
}
