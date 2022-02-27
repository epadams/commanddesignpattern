import java.util.concurrent.TimeUnit;

/**
 * A Command that quits the game
 * 
 * @author Grant King
 */
public class QuitCommand implements Command {
    private Player player;

    /**
     * this method create our quit command for the player
     * @param player the player we want to quit the game
     */
    public QuitCommand(Player player) {
        this.player = player;
    }

    /**
     * Executes the command
     */
    public void execute() {
        System.out.println("Quitting");
        sleep(1000);
        clear();
    }

    /**
     * Pauses the program temporarily
     * 
     * @param num The duration of the pause
     */
    private void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timer error");
        }
    }

    /**
     * Clears the console
     */
    private void clear() {
        System.out.print("\033[H\033[2J");
    }
}
