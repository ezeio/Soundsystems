package configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import soundsystem.CompactDisc;
import soundsystem.MichealJackson;
import soundsystem.SgtPeppers;

@Configuration
@ComponentScan(basePackages = "soundsystem")
public class CDConfig{

    //@Bean
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }



   // @Bean
    //@Primary
    @Qualifier("micheal")
    public CompactDisc michealJackson(){
        return new MichealJackson();
    }
}
