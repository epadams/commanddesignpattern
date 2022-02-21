import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class FireCommand implements Command{
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

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void execute(){
        Player.Fire();
    }
    private void sleep(int num){
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timmer error");
        }
    }
    
    private void clear() {
        System.out.print("\033[H\033[2J");
    }
}
