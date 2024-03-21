package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final int numbersOfColors = Color.values().length;
    private Random random = new Random();

    public String getRandomColor() {
        Color color = Color.values()[random.nextInt(numbersOfColors)];
        return color.name();
    }
}
