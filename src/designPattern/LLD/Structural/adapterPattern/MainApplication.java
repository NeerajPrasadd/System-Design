package designPattern.LLD.Structural.adapterPattern;

/**
 * <Class Name>: MainApplication
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public class MainApplication {
    public static void main(String[] args) {
        AudioPlayer mediaPlayer = new AudioPlayer();
        mediaPlayer.play("vlc","humumatata");
        mediaPlayer.play("mp3","humumatata");
        mediaPlayer.play("Itune","humumatata");


    }
}
