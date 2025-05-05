package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    private final Random random = new Random();

    public Color getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
