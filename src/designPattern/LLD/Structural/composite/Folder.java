package designPattern.LLD.Structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * <Class Name>: Folder
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 05/11/24
 */
public class Folder implements FileSystemComponents {
    private String name;
    private List<FileSystemComponents> items = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponents(FileSystemComponents components) {
        items.add(components);
    }

    public void removeComponent(FileSystemComponents components) {
        items.remove(components);
    }

    @Override
    public void showDetails() {
        System.out.println("folder Name "+name);
        for (FileSystemComponents component : items) {
            component.showDetails(); // Recursive count for all items in the folder
        }

    }

    @Override
    public int count() {
        int count = 0;
        for (FileSystemComponents component : items) {
            count += component.count(); // Recursive count for all items in the folder
        }
//        System.out.println(count);
        return count;
    }
}
