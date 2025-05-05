package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int NUMBER_OF_COLORS = Colors.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        return Colors.values()[random.nextInt(NUMBER_OF_COLORS)].name();
    }
}
