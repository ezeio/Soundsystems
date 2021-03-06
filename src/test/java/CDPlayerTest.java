import configuration.CDConfig;
import configuration.CDPlayerConfig;
import configuration.SoundSystemConfig;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.CompactDisc;
import soundsystem.MediaPlayer;
import static org.junit.Assert.*;
import org.junit.Rule;





@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= SoundSystemConfig.class)
public class CDPlayerTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Autowired
    private MediaPlayer player;

    @Autowired
    @Qualifier("blank")
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }



    @Test
    public void play(){
        player.play();
        assertEquals("Playing Dangerously in love by Beyonce\n",
                log.getLog());

    }
}
