package designPattern.LLD.Structural.adapterPattern;

/**
 * <Class Name>: MediaAdapter
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public class MediaAdapter  {

    MediaPlayer mediaPlayer;

    public MediaAdapter(String playerMode) {
        if(playerMode.equals("vlc")){
            mediaPlayer =  new VlcPlayer();
        }else if (playerMode.equals("Itune")){
            mediaPlayer=new ItunePlayer();
        }
    }


    public void play(String filename) {
        mediaPlayer.play(filename);
    }


}
