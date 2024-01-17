package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int NUMBER_OF_COLORS = 3;
    private final Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(NUMBER_OF_COLORS)].name();
    }
}
