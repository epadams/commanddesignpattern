import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * A Command that makes the player run from left to right
 * 
 * @author Grant King
 */
public class RunCommand implements Command {
    private Player player;
    
    /**
     * Constructs the RunCommand
     * 
     * @param player The player to move
     */
    public RunCommand(Player player) {

    }

    /**
     * Executes the command
     */
    public void execute() {
        File myFile = new File("run.txt");
        try {
            BufferedReader bReader = new BufferedReader(new FileReader(myFile));
            String line = bReader.readLine();
            clear();
            while (line != null) {
                for (int i = 0; i < 3; i++) {
                    System.out.println(line);
                    if ((line = bReader.readLine()) == null) {
                        break;
                    }
                }
                sleep(100);
                clear();
            }
            bReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
