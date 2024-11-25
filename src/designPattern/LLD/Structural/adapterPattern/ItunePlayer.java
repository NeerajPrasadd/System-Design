package designPattern.LLD.Structural.adapterPattern;

/**
 * <Class Name>: VlcPlayer
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public class ItunePlayer implements MediaPlayer {
    @Override
    public void play(String filename) {
        System.out.println("Playing song in Itune player + " + filename);
    }
}
