package designPattern.LLD.Structural.adapterPattern;

/**
 * <Class Name>: AudioPlayer
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public class AudioPlayer {


    public void play(String playerMode, String filename) {
        MediaFactory mediaFactory = new MediaFactory(playerMode);
        MediaPlayer mediaPlayer = mediaFactory.getMediaPlayer();
        mediaPlayer.play(filename);
    }
}
