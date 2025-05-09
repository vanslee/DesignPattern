package Strategy;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ClassPathResourceLoader implements ResourceLoader{

    @Override
    public String loadResource(String location) throws IOException {
       String path = location.replace("classpath:", "");
       try(InputStream is = getClass().getClassLoader().getResourceAsStream(path)){
        if (is == null) {
            throw new IOException("Resource Not Found:"+ path);
        }
        Path path2 = Paths.get(path);
        return new String(Files.readAllBytes(path2));
       }
    }
    
}
