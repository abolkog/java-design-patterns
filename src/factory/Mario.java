package factory;

/**
 *
 * @author Khalid Elshafie <abolkog@gmail.com>
 * @created 08/03/2018.
 */
public class Mario {

    private String name;
    private int health = 100;
    private int jumpAttack = 10;
    private int mushroomAttack = 20;

    public Mario(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getJumpAttack() {
        return jumpAttack;
    }

    public int getMushroomAttack() {
        return mushroomAttack;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
}
