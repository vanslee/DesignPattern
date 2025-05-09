package Composite;

abstract class FileSystemComponent {
    public void add(FileSystemComponent component){
        throw new UnsupportedOperationException("Cannot add to a leaf component!");
    }
    public abstract void display(int depth);
}
