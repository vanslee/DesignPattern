package Proxy;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // 延迟加载 - 只有在真正需要显示时才加载图片
        if (realImage == null) {
            System.out.println("显示占位图...");
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
