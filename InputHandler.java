/**
 * A class that will handle all input for the Command Design Pattern.
 *
 * @author Ethan Adams
 */
import java.util.HashMap;
public class InputHandler {
  private HashMap<String, Command> commands;

  public InputHandler(Player player) {
    this.commands = new HashMap<String, Command>();
    this.commands.put("jump", JumpCommand(player));
    this.commands.put("run", RunCommand(player);
    this.commands.put("fire", FireCommand(player);
    this.commands.put("quit", QuitCommand(player));
  }

  public void buttonPressed(String button) {
    if (button.equalsIgnoreCase("jump")) {
      this.commands.get("jump").execute();
    } else if (button.equalsIgnoreCase("run")) {
      this.commands.get("run").execute();
    } else if (button.equalsIgnoreCase("fire")) {
      this.commands.get("fire").execute();
    } else if (button.equalsIgnoreCase("quit")) {
      this.commands.get("quit").execute();
    }
  }
}
