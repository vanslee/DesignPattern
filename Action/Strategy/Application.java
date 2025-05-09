package Action.Strategy;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        String[] resources = {
                "classpath:config.txt", // 类路径资源
                "file:/tmp/data.txt", // 文件系统资源
                "https://example.com/api/data" // 网络资源
        };
        for (String location : resources) {
            try {
                // 通过工厂获取策略并加载资源
                ResourceLoader loader = ResourceLoaderFactory.getLoader(location);
                String content = loader.loadResource(location);
                System.out.println("Loaded from " + location + ":\n" + content + "\n");
            } catch (IOException e) {
                System.err.println("Failed to load resource: " + e.getMessage());
            }
        }
    }
}
