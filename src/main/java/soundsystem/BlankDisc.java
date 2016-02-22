package soundsystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("blank")
public class BlankDisc implements CompactDisc{


    @Value("${disc.title}")
    private String title;


    @Value("${disc.artist}")
    private String artist;


    public BlankDisc(){}


   /*
    public BlankDisc(
            @Value("${disc.title}") String title,
            @Value("${disc.artist}") String artist){
        this.title = title;
        this.artist= artist;
    }*/



        public void play(){
            System.out.println("Playing "+ title + " by "+ artist);
        }



}
