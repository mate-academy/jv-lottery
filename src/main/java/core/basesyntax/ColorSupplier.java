package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int figureCount = 3;

    public String getRandomColor() {
        return Color.values()[new Random().nextInt(figureCount)].name();
    }
}
