package core.basesyntax;

import java.util.Random;

public abstract class ColorSupplier {
    public String getRandomColor() {
        Colors[] colorsR = Colors.values();
        Random mRnd = new Random();
        return colorsR[mRnd.nextInt(colorsR.length)].toString();
    }

    public abstract String toString();
}

