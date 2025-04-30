package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_ENUM_SIZE = Color.values().length;

    private static final Random random = new Random();

    public Color getRandomColor() {
        return Color.values()[random.nextInt(COLOR_ENUM_SIZE)];
    }
}
