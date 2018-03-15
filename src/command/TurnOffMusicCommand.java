package command;

/**
 * @author Khalid Elshafie <abolkog@gmail.com>
 * @created 14/03/2018.
 */
public class TurnOffMusicCommand implements Command {

    private MusicPlayer musicPlayer;

    public TurnOffMusicCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        this.musicPlayer.turnOff();
    }

    @Override
    public void undo() {
        this.musicPlayer.turnOn();
    }
}
