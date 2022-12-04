package osmonaliev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContex.xml"
        );
//
//        Music music = context.getBean("rockMusic", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
        //вместо
//  <bean id="musicBean"
//          class="osmonaliev.ClasicalMusic"
//          init-method="doMyInit"
//          destroy-method="doMyDectroy"
//          factory-method="getClasicalMusik">
//
//    </bean>
        //    <context:component-scan base-package="osmonaliev" /> и анатации @Component
//        Music music2 = context.getBean("classicalMusic", Music.class);
//        MusicPlayer musicPlayer1 = new MusicPlayer(music2);
//        musicPlayer1.playMusic();


//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer1.playMusic();

        Computer computer = context.getBean("computer",Computer.class);
        System.out.println(computer);
        context.close();
    }
    }

