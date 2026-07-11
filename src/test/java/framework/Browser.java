package framework;

public enum Browser {
    CHROME,
    FIREFOX,
    EDGE;

    public static Browser from(String value) {
        if (value == null || value.trim().isEmpty()) {
            return CHROME;
        }

        return Browser.valueOf(value.trim().toUpperCase());
    }
}
