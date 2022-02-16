package core.basesyntax;

import java.util.Random;

public abstract class ColorSupplier {
    public String getRandomColor() {
        Colors[] colorsR = Colors.values();
        Random random = new Random();
        return colorsR[random.nextInt(colorsR.length)].toString();
    }

    public abstract String toString();
}

