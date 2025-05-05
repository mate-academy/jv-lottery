package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int colorCount = Color.values().length;
        int ordinal = random.nextInt(colorCount);

        Color[] colors = Color.values();

        return colors[ordinal].name().toLowerCase();
    }
}
