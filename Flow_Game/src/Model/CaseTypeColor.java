package Model;

import java.awt.*;

public enum CaseTypeColor {
    S1("S1", Color.GREEN),
    S2("S2", Color.RED),
    S3("S3", Color.BLUE),
    S4("S4", Color.YELLOW),
    S5("S5", Color.MAGENTA),
    S6("S6", Color.CYAN),
    empty("empty", Color.black);





    private final String key;
    private final Color value;

    CaseTypeColor(String key, Color value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public Color getValue() {
        return value;
    }
}
