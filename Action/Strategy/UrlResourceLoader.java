package Action.Strategy;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UrlResourceLoader implements ResourceLoader{
    @Override
    public String loadResource(String location) throws IOException {
        try (InputStream is = new URL(location).openStream()) {
            Path path = Paths.get(location);
            return new String(Files.readAllBytes(path));
        }
    }
}
