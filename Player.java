public class Player {

  public Player() {
    System.out.println("Our Hero is Born");
  }

  public void jump() {
    Command jc = new JumpCommand(this);
    jc.execute();
  }

  public void fire() {
    Command f = new FireCommand(this);
    f.execute();
  }

  public void runForward() {
    Command rf = new RunCommand(this);
    rf.execute();
  }
}
