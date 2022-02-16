package core.basesyntax;

import java.util.Random;

public abstract class ColorSupplier {
    public String getRandomColor() {
        Colors[] colors = Colors.values();
        Random random = new Random();
        return colors[random.nextInt(colorsR.length)].toString();
    }

    public abstract String toString();
}

