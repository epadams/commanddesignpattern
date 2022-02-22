public class QuitCommand implements Command {
  public QuitCommand() {

  }

  public void execute() {
    System.exit(0);
  }
}
