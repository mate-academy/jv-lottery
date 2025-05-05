package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLORS_QUANTITY = Colors.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        return Colors.values()[random.nextInt(COLORS_QUANTITY)].name();
    }
}
