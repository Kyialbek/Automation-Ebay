package framework;

import java.time.Duration;

public final class Config {
    private Config() {
    }

    public static Browser browser() {
        return Browser.from(System.getProperty("browser", "chrome"));
    }

    public static boolean headless() {
        return Boolean.parseBoolean(System.getProperty("headless", "false"));
    }

    public static Duration timeout() {
        return Duration.ofSeconds(Long.parseLong(System.getProperty("timeoutSeconds", "10")));
    }

    public static String baseUrl() {
        return System.getProperty("baseUrl", "https://www.ebay.com");
    }
}
