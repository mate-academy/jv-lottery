package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    // Moved Random to a class-level field
    private static final Random random = new Random();

    public static Color getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
