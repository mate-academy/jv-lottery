package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    private final Random random = new Random();

    public Color getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)];
    }
}
