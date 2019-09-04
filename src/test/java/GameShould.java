import org.junit.Test;

public class GameShould {

    @Test
    public void finishWhenBotIsPlaying(){
        Arbitru arb=new Arbitru(4,new BotPlayer());
        arb.play();
    }
}
