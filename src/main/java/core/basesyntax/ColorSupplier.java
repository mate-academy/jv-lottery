package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int MAX_NUMBER_OF_COLORS = Colors.values().length;
    private final Random random = new Random();

    public Colors getRandomColor() {
        int index = random.nextInt(MAX_NUMBER_OF_COLORS);
        return Colors.values()[index];
    }
}
