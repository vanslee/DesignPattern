package Strategy;

import java.io.IOException;

public interface ResourceLoader {
    String loadResource(String location) throws IOException;
}
