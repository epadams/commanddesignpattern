import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
/**
 * A class that allows the player to jump
 * @author Will Columbia
 */
public class JumpCommand implements Command{
/**
 * Reading in the file jump.txt, displays 6 lines of the file at a time, sleeps then resets the console
 * @param player
 */
public JumpCommand(Player player) {
    File myFile = new File("jump.txt");
    try {
        String line = null;
        BufferedReader br = new BufferedReader(new FileReader(myFile));
        while((line = br.readLine()) != null){
            for(int i = 0;i<6;i++){
                System.out.println(line);
                sleep(3);
                clear();
            }
        }

    } 
    catch (IOException e) {
        e.printStackTrace();
    }
}
/**
 * executes the jump command
 */
@Override
public void execute(){
    Player.jump();
}
/**
 * allows for a brief sleep period
 * @param num
 */
private void sleep(int num){
    try {
        TimeUnit.MILLISECONDS.sleep(num);
    } catch (Exception e) {
        System.out.println("Timmer error");
    }
}
/**
 * clears the console
 */
private void clear() {
    System.out.print("\033[H\033[2J");
}
}
