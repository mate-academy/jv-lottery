package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLORS_LENGTH = Color.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(COLORS_LENGTH);
        return Color.values()[index].toString();
    }
}
