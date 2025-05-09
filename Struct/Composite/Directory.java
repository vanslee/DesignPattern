package Struct.Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public void add(FileSystemComponent component) {
        children.add(component);
    }
    
    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void display(int depth) {
        String repeated = "-";

        for (int i = 0; i < depth; i++) {
            repeated += repeated;
        }
        System.out.println(repeated + "Directory:" + name);
        for (FileSystemComponent children : children) {
            children.display(depth + 2);
        }

    }

}
