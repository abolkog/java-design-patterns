package proxy;

/**
 * @author Khalid Elshafie <abolkog@gmail.com>
 * @created 18/03/2018.
 */
public class Etisalat implements ISP {

    private int browsingSpeed = 10;

    @Override
    public String serverSite(String url) {
        return String.format("https://%s.com", url);
    }


    public int getBrowsingSpeed() {
        return browsingSpeed;
    }

    public void setBrowsingSpeed(int browsingSpeed) {
        this.browsingSpeed = browsingSpeed;
    }
}
