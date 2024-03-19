package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int numbersOfColors = Colors.values().length;
    private Random index = new Random();

    public String getRandomColor() {
        Colors color = Colors.values()[index.nextInt(numbersOfColors)];
        return color.name();
    }
}
