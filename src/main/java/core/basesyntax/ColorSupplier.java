package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Color[] color = Color.values();
    private static final int COLOR_COUNT = color.length;
    Random randomValueSupplier = new Random();
    public String getRandomColor() {
        int value = randomValueSupplier.nextInt(COLOR_COUNT);
        return color[value];
    }
}