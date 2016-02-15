package configuration;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import soundsystem.CDPlayer;
import soundsystem.CompactDisc;
import soundsystem.MediaPlayer;
import soundsystem.SgtPeppers;

@Configuration
@ComponentScan(basePackages = "soundsystem")// discovers beans that spring creates.Used in auto configuration.
public class CDPlayerConfig {






    //@Bean
    public MediaPlayer cdPlayer(CompactDisc compactDisc){
        CDPlayer cdPlayer = new CDPlayer();
        cdPlayer.insertDisc(compactDisc);

        return cdPlayer;
    }
}
