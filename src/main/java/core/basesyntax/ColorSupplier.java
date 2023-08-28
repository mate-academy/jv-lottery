package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    private Random random = new Random();

    String getRandomColor() {
        int indexOfColor = random.nextInt(Color.values().length);
        return Color.values()[indexOfColor].name();
    }
}
