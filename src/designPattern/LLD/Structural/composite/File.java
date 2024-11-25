package designPattern.LLD.Structural.composite;

/**
 * <Class Name>: File
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public class File implements FileSystemComponents {
    private String filename;

    public File(String filename) {
        this.filename = filename;
    }

    @Override
    public void showDetails() {
        System.out.println("    Filename "+ filename);

    }

    @Override
    public int count() {

        return 1;
    }
}
