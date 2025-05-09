package Action.Strategy;

public class ResourceLoaderFactory {
    public static ResourceLoader getLoader(String location) {
        if (location.startsWith("classpath:")) {
            return new ClassPathResourceLoader();
        } else if (location.startsWith("file:")) {
            return new FileSystemResourceLoader();
        } else if (location.startsWith("http:") || location.startsWith("https:")) {
            return new UrlResourceLoader();
        } else {
            throw new IllegalArgumentException("Unsupported resource location: " + location);
        }
    }
}
