package Proxy;

public class RealImage implements Image {
    private String fileName;

    @Override
    public void display() {
        System.out.println("显示图片：" + fileName);
    }

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(); // 初始化时从磁盘加载图片
    }

    private void loadFromDisk() {
        System.out.println("加载图片：" + fileName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
