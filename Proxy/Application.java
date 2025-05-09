package Proxy;

public class Application {
    public static void main(String[] args) {
        // 使用代理加载图片
        Image image = new ProxyImage("test.jpg");

        System.out.println("第一次调用display():");
        image.display(); // 图片将从磁盘加载

        System.out.println("\n第二次调用display():");
        image.display(); // 图片已经加载过，直接显示
    }
}
