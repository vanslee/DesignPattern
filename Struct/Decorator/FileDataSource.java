package Struct.Decorator;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDataSource implements DataSource {
    private String url;

    public FileDataSource(String url) {
        this.url = url;
    }

    @Override
    public void writeData(String data) {
        try {
            // 使用 Java NIO 写入文件（自动创建父目录）
            String currentDir = Paths.get("").toAbsolutePath().toString();
            String filePath = currentDir + "/a.txt"; // 拼接文件路径
            Path path = Paths.get(filePath);
            Files.createDirectories(path.getParent()); // 确保目录存在
            Files.write(path, data.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException("写入文件失败: " + url, e);
        }
    }

    @Override
    public String readData() {
        try {
            // 使用 Java NIO 读取文件
            String currentDir = Paths.get("").toAbsolutePath().toString();
            String filePath = currentDir + "/a.txt"; // 拼接文件路径
            Path path = Paths.get(filePath);
            byte[] bytes = Files.readAllBytes(path);
            return new String(bytes, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException("读取文件失败: " + url, e);
        }
    }
}
