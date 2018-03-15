package command;

/**
 * @author Khalid Elshafie <abolkog@gmail.com>
 * @created 14/03/2018.
 */
public class TurnOnLightCommand implements Command {

    private Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOn();
    }

    @Override
    public void undo() {
        this.light.turnOff();
    }
}
