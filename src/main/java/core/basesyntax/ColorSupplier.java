package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_VALUES = Color.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(COLOR_VALUES);
        Color color = Color.values()[index];
        return String.valueOf(color);
    }
}
