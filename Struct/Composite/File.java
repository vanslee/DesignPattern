package Struct.Composite;

public class File extends FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display(int depth) {
        // TODO Auto-generated method stub
        String repeated = "-";

        for (int i = 0; i < depth; i++) {
            repeated += repeated;
        }
        System.out.println(repeated + "File:" + name);
    }

}
