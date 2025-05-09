package Action.Strategy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSystemResourceLoader implements ResourceLoader {

    @Override
    public String loadResource(String location) throws IOException {
        // 去掉前缀 "file:"
        String path = location.replace("file:", "");
        Path path2 = Paths.get(path);
        return new String(Files.readAllBytes(path2));
    }

}
