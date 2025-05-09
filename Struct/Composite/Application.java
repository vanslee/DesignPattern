package Struct.Composite;

public class Application {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory subDir1 = new Directory("subDir1");
        Directory subDir2 = new Directory("subDir2");
        File file1 = new File("file1.txt");;
        File file2 = new File("file2.txt");;
        File file3 = new File("file3.txt");;
        root.add(subDir1);
        root.add(file1);
        subDir1.add(file2);
        subDir1.add(subDir2);
        subDir2.add(file3);
        root.display(0);

    }
}
