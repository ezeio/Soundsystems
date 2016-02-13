package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import soundsystem.CompactDisc;
import soundsystem.MichealJackson;
import soundsystem.SgtPeppers;

@Configuration
public class CDConfig{

    @Bean
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }



    @Bean
   // @Primary
    CompactDisc michealJackson(){
        return new MichealJackson();
    }
}
