package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_ENUM_LENGTH = Color.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        Color[] colors = Color.values();
        return colors[random.nextInt(COLOR_ENUM_LENGTH)].name();
    }
}
