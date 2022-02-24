// package command;

import java.util.Scanner;
/**
 * this class is used to drive the game. Carrie our main adn controls display to console
 * @author Ethan Adams
 */
public class GameDriver {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String command = "";

    Player player = new Player();
    InputHandler inHandler = new InputHandler(player);

    while (!command.contentEquals("quit")) {
      System.out.print("Enter command: ");
      command = in.next().toLowerCase().trim();
      inHandler.buttonPressed(command);
    }
    in.close();
  }
}
