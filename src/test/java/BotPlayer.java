import java.util.Random;

public class BotPlayer implements Playable{

    public int[] getCoord(){
        Random r=new Random();
        return new int[] {r.nextInt(4),r.nextInt(4)};
    }
}
