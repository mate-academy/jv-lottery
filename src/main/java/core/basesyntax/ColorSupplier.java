package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = Colors.values().length;
    public String getRandomColor() {
        Random randomValueSupplier = new Random();
        int value = randomValueSupplier.nextInt(COLOR_COUNT);
        Colors color = Colors.value(value);
        return color;
    }
}