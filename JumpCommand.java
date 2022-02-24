import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
/**
 * A class that allows the player to jump.
 *
 * @author Will Columbia
 */

public class JumpCommand implements Command {
  /**
   * Reading in the file jump.txt, displays 6 lines of the file at a time,
   * sleeps then resets the console.
   *
   * @param player Player to be passed in.
   */
  public JumpCommand(Player player) {

  }

  /**
   * Executes the jump command.
   */
  @Override
  public void execute() {
    File myFile = new File("jump.txt");
    try {
      BufferedReader br = new BufferedReader(new FileReader(myFile));
      String line = br.readLine();
      clear();
      while (line != null) {
        for (int i = 0; i < 6; i++) {
          System.out.println(line);
          if ((line = br.readLine()) == null) {
            break;
          }
        }
        sleep(100);
        clear();
      }
      br.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  /**
   * Allows for a brief sleep period.
   *
   * @param num Amount of time in milliseconds to sleep.
   */
  private void sleep(int num) {
    try {
      TimeUnit.MILLISECONDS.sleep(num);
    } catch (Exception e) {
      System.out.println("Timmer error");
    }
  }

  /**
   * Clears the console.
   */
  private void clear() {
    System.out.print("\033[H\033[2J");
  }
}
