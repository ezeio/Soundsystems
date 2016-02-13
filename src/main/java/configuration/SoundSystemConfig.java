package configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import soundsystem.CDPlayer;

@Configuration
@Import({CDPlayer.class,CDConfig.class})
public class SoundSystemConfig {
}
