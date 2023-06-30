package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Colors getRandomColor() {
        int colorsLength = Colors.values().length;
        int index = random.nextInt(colorsLength);
        return Colors.values()[index];
    }
}
