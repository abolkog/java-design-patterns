package command;

/**
 * @author Khalid Elshafie <abolkog@gmail.com>
 * @created 14/03/2018.
 */
public class TurnOnTVCommand implements Command {

    private TV tv;

    public TurnOnTVCommand(TV light) {
        this.tv = light;
    }

    @Override
    public void execute() {
        this.tv.turnOn();
    }

    @Override
    public void undo() {
        this.tv.turnOff();
    }
}
