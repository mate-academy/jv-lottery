package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int figureCount = 3;

    private final Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(figureCount)].name();
    }
}
