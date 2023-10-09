package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int FIGURE_COUNT = 3;

    public String getRandomColor() {
        return Color.values()[new Random().nextInt(FIGURE_COUNT)].name();
    }
}
