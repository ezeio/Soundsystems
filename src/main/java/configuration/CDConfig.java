package configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import soundsystem.BlankDisc;
import soundsystem.CompactDisc;
import soundsystem.MichealJackson;
import soundsystem.SgtPeppers;

@Configuration
@ComponentScan(basePackages = "soundsystem")
@PropertySource("classpath:app.properties")

public class CDConfig{


    @Autowired
    Environment env;


    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }






  /* @Bean
    @Qualifier("blank")
    public BlankDisc disc(){
        return new BlankDisc(
                env.getRequiredProperty("disc.title"),
                env.getRequiredProperty("disc.artist")
        );
    }*/


/*
    @Bean
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }



   @Bean
   @Qualifier("micheal")
    public CompactDisc michealJackson(){
        return new MichealJackson();
    }*/
}
