package command;

/**
 * @author Khalid Elshafie <abolkog@gmail.com>
 * @created 14/03/2018.
 */
public interface Command {

    void execute();

    void undo();
}
