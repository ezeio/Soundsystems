package soundsystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {


    private CompactDisc cd;

/*
    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }
**/


    @Autowired
    @Qualifier("blank")
    public void insertDisc(CompactDisc cd){
        this.cd = cd;
    }



    public void play(){
        cd.play();
    }


}
