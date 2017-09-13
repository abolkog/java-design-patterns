package observer;

/**
 * Main Class
 * @author Khalid Elshafie
 * @created 9/13/17
 */
public class Exec {

    public static void main(String[] args) {
        //Instnace of the product
        Product phone = new Product("Banana Phone");

        //Person Observable
        Person khalid = new Person("khalid");
        Person sami = new Person("sami");
        Person busrha = new Person("busrha");

        //Company Observable
        Company company = new Company("abolkog.com", "123 abc street");

        //Add the observers
        phone.addObserver(khalid);
        phone.addObserver(sami);
        phone.addObserver(busrha);

        phone.addObserver(company);

        //Simple loop
        for(int i = 0; i < 5; i++) {
            //Example of removing obsever
            if (i == 2) {
                phone.removeObserver(sami);
            }

            //Set avaibality based on the i value (Just for demo)
            boolean avaiable = i % 2 == 0;
            phone.setAvailablity(avaiable);

            //Simple delay for printing out the data.
            try { Thread.sleep(1000); } catch (InterruptedException ie){}

            System.out.println("--------------------------------");
        }

    }
}
