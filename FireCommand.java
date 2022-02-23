import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
/**
 * A class that allows the player to shoot a weapon.
 *
 * @author Will Columbia
 */

public class FireCommand implements Command {

  /**
   * Reads in fire.txt and loops through 3 lines before resting and clearing the console
   *
   * @param player Player to be passed in.
   */
  public FireCommand(Player player) {

  }

  /**
   * Executes the fire command.
   */
  @Override
  public void execute() {
    File myFile = new File("fire.txt");
    try {
      String line = "";
      BufferedReader br = new BufferedReader(new FileReader(myFile));
      // while((line = br.readLine()) != null) {
      while (line != null) {
        for (int i = 0; i < 3; i++) {
          line = br.readLine();
          System.out.println(line);
        }
        sleep(50);
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
   * @param num Number of time in milliseconds to be slept.
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
