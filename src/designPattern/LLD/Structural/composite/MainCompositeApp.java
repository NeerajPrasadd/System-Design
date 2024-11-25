package designPattern.LLD.Structural.composite;

/**
 * <Class Name>: MainCompositeApp
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public class MainCompositeApp {
    public static void main(String[] args) {
        File file1 = new File("Document.txt");
        File file2 = new File("Photo.jpg");
        File file3 = new File("Video.mp4");

        // Create folders
        Folder rootFolder = new Folder("Root");
        Folder documentsFolder = new Folder("Documents");
        Folder mediaFolder = new Folder("Media");

        rootFolder.addComponents(documentsFolder);
        rootFolder.addComponents(mediaFolder);
        documentsFolder.addComponents(file1);
        mediaFolder.addComponents(file2);
        mediaFolder.addComponents(file3);

        // Display the structure and count items
        rootFolder.showDetails();
        System.out.println("Total items in root: " + rootFolder.count());

    }
}
