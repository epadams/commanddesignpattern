import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
/**
 * A class that allows the player to shoot a weapon
 * @author Will Columbia
 */
public class FireCommand implements Command{
    /**
     * reads in fire.txt and loops through 3 lines before resting and clearing the console
     * @param player
     */
    public void FireCommand(Player player){
        
        File myFile = new File("fire.txt");
        try {
            String line = null;
            BufferedReader br = new BufferedReader(new FileReader(myFile));
            while((line = br.readLine()) != null){
                for(int i = 0;i<4;i++){
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
     * Executes the fire command
     */
    @Override
    public void execute(){
        Player.fire();
    }
    /**
     * Allows for a brief sleep period 
     * @param num
     */
    private void sleep(int num){
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } 
        catch (Exception e) {
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
