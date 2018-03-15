package command;

/**
 * @author Khalid Elshafie <abolkog@gmail.com>
 * @created 14/03/2018.
 */
public class TurnOnMusicCommand implements Command {

    private MusicPlayer musicPlayer;

    public TurnOnMusicCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        this.musicPlayer.turnOn();
    }

    @Override
    public void undo() {
        this.musicPlayer.turnOff();
    }
}
