package designPattern.LLD.Structural.adapterPattern;

/**
 * <Class Name>: DefaultPlayer
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public class DefaultPlayer  implements MediaPlayer{

    public void play(String filename) {
        System.out.println("we are playing default song "+ filename);
    }
}
