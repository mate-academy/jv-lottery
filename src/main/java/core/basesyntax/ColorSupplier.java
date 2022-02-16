package core.basesyntax;

import java.util.Random;

public abstract class ColorSupplier {
    public String getRandomColor() {
        Colors[] colorsR = Colors.values();
        Random mrnd = new Random();
        return colorsR[mrnd.nextInt(colorsR.length)].toString();
    }

    public abstract String toString();
}

