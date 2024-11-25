package designPattern.LLD.Structural.adapterPattern;

/**
 * <Class Name>: MediaFactory
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public class MediaFactory {
    private MediaPlayer mediaPlayer;

    public MediaFactory(String mediaType) {
        if (mediaType.equals("vlc")) {
            mediaPlayer = new VlcPlayer();

        } else if (mediaType.equals("Itune")) {
            mediaPlayer = new ItunePlayer();
        } else {
            mediaPlayer = new DefaultPlayer();
        }
    }

    public MediaPlayer getMediaPlayer() {
        return mediaPlayer;
    }
}
