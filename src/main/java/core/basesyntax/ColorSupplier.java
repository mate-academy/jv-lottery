package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = 6;
    private Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        int colorNumber = new Random().nextInt(Color.values().length);
        return (Color.values()[colorNumber]).name();
    }
}
