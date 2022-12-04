package osmonaliev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */
@Component
public class MusicPlayer {
//    private ClassicalMusic classicalMusic;
//    private RockMusic rockMusic;
//@Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }

    private Music music1;
    private Music music2;
@Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
    return "PlYING" +music1.getSong()
  +"PlYING" +music2.getSong();

    }
}
