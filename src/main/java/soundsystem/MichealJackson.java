package soundsystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("micheal")
public class MichealJackson implements CompactDisc {

    private String title = "Dangerous";
    private String artist = "Micheal Jackson";



    public void play(){
        System.out.println("Playing "+ title + " by "+ artist);
    }
}
