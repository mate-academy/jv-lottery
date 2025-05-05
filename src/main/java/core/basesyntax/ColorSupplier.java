package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomSupplier = new Random();

    public String getRandomColor() {
        Colors[] colors = Colors.values();
        int randomColorIndex = randomSupplier.nextInt(colors.length);

        return colors[randomColorIndex].name();
    }
}
