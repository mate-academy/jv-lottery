package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = 4;
    private final Random rand = new Random();

    public String getRandomColor() {
        int colorIdx = rand.nextInt(COLOR_COUNT);
        return Color.values()[colorIdx].name();
    }
}
