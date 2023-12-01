package core.basesyntax;

import java.util.Random;

public final class ColorSupplier {
    private final Random random = new Random();
    private final int colorIndex = random.nextInt(Colors.values().length);
    private final String randomColor = Colors.values()[colorIndex].name();

    public String getRandomColor() {
        return randomColor;
    }
}
