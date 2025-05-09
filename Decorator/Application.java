package Decorator;

public class Application {
    public static void main(String[] args) {
        DataSource source = new EncryptionDecorator(new FileDataSource("a.txt"));
        source.writeData("Secret"); // 自动加密后写入
        System.out.println();
        System.out.println(source.readData());
    }
}
