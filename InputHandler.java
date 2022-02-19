public class InputHandler {
  private HashMap<String, command> commands;

  public InputHandler(Player player) {
    this.commands = new HashMap<String, command>();
    this.commands.put("jump", JumpCommand);
    this.commands.put("run", RunCommand);
    this.commands.put("fire", FireCommand);
    this.commands.put("quit", QuitCommand);
  }

  public void buttonPressed(String button) {
    if (button.equalsIgnoreCase("jump")) {
      JumpCommand();
    } else if (button.equalsIgnoreCase("run")) {
      RunCommand();
    } else if (button.equalsIgnoreCase("fire")) {
      FireCommand();
    } else if (button.equalsIgnoreCase("quit")) {
      QuitCommand();
    }
  }
}
