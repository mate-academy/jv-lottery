package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Colors getRandomColor() {
        // Random randomColorIndex = new Random();
        return Colors.values()[new Random().nextInt(Colors.values().length)];
    }
}
