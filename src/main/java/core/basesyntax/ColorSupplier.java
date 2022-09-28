package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = 6;
    private Random random = new Random();

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        int colorNumber = new Random().nextInt(DifferentColors.values().length);
        return (DifferentColors.values()[colorNumber]).name();
    }
}
