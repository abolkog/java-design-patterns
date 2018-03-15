package command;

/**
 * @author Khalid Elshafie <abolkog@gmail.com>
 * @created 14/03/2018.
 */
public class Client {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        TurnOnLightCommand turnOnLightCommand = new TurnOnLightCommand(light);
        TurnOffLightCommand turnOffLightCommand = new TurnOffLightCommand(light);

        TV tv = new TV();
        TurnOnTVCommand turnOnTVCommand = new TurnOnTVCommand(tv);
        TurnOffTVCommand turnOffTVCommand = new TurnOffTVCommand(tv);

        MusicPlayer musicPlayer = new MusicPlayer();
        TurnOnMusicCommand turnOnMusicCommand = new TurnOnMusicCommand(musicPlayer);
        TurnOffMusicCommand turnOffMusicCommand = new TurnOffMusicCommand(musicPlayer);

        remoteControl.addCommand(0, turnOnLightCommand, turnOffLightCommand);
        remoteControl.addCommand(1, turnOnTVCommand, turnOffTVCommand);
        remoteControl.addCommand(2, turnOnMusicCommand, turnOffMusicCommand);


        System.out.println(remoteControl);


        System.out.println("------ Executing Commands ------");
        remoteControl.onButtonPressed(0);
        remoteControl.onButtonPressed(1);

        remoteControl.offButtonPressed(0);
        remoteControl.offButtonPressed(1);

        remoteControl.onButtonPressed(2);

        System.out.println("------ Undoing Commands ------");

        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();
        remoteControl.undoButtonPressed();

    }
}
