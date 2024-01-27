package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int colorsCount = Color.values().length;
        return Color.values()[random.nextInt(colorsCount)].name();
    }
}
