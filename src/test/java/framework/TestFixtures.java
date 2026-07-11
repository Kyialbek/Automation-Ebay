package framework;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public final class TestFixtures {
    private TestFixtures() {
    }

    public static String fileUrl(String resourcePath) {
        URL resource = TestFixtures.class.getClassLoader().getResource(resourcePath);
        if (resource == null) {
            throw new IllegalArgumentException("Fixture not found: " + resourcePath);
        }

        try {
            return Paths.get(resource.toURI()).toUri().toString();
        } catch (URISyntaxException exception) {
            throw new IllegalArgumentException("Invalid fixture path: " + resourcePath, exception);
        }
    }
}
