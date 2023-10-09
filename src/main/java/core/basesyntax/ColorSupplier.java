package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Colors[] allColors = Colors.values();
    private final Random random = new Random();

    public Colors getRandomColor() {
        int index = random.nextInt(allColors.length);
        return allColors[index];
    }
}
