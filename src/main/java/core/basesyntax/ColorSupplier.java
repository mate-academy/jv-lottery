package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int FIGURE_COUNT = 3;

    private final Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(FIGURE_COUNT)].name();
    }
}
