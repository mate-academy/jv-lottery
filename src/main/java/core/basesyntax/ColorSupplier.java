package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_VALUES_LENGTH = Color.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        Color color = Color.values()[random.nextInt(COLOR_VALUES_LENGTH)];
        return color.name();
    }
}
