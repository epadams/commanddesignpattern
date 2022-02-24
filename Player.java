/**
 * The player class is the hero who can execute the jump, fire and run commands
 * 
 * @Author Alex Hutton
 */
public class Player {

  /**
   * The player constructor, states the hero has been born
   * 
   * @Author Alex Hutton
   */
  public Player() {
    System.out.println("Our Hero is Born");
  }

  /**
   * Jump creates and executes the jump command
   * 
   * @Author Alex Hutton
   */
  public void jump() {
    Command jc = new JumpCommand(this);
    jc.execute();
  }

  /**
   * Creates and executes the fire command
   * 
   * @Author Alex Hutton
   */
  public void fire() {
    Command f = new FireCommand(this);
    f.execute();
  }

  /**
   * Creates and executes the run command
   * 
   * @Author Alex Hutton
   */
  public void runForward() {
    Command rf = new RunCommand(this);
    rf.execute();
  }
}
