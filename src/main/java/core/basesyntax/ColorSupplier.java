package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public ColorDiff getRandomColor() {
        ColorDiff[] clr = ColorDiff.values();
        Random random = new Random();
        int n = random.nextInt(7);
        return clr[n];
    }
}

