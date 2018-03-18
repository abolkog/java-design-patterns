package proxy;

import java.util.Arrays;
import java.util.List;

/**
 * @author Khalid Elshafie <abolkog@gmail.com>
 * @created 18/03/2018.
 */
public class Client {

    public static void main(String[] args) {
        List<String> site = Arrays.asList("facebook", "porno", "twitter", "abolkog", "youtube", "cnn");


        ISP internet = new InternetProxy();

        for(String string: site) {
            System.out.println(internet.serverSite(string));
        }
    }
}
