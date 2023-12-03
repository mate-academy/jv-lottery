package core.basesyntax;

import java.util.Random;

public final class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        final int colorIndex = random.nextInt(Color.values().length);
        return Color.values()[colorIndex].name();
    }
}
